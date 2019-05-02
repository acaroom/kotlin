package chap07.section2

interface Switcher { // 인터페이스의 선언
    fun on(): String
}

class Smartphone(val model: String) {

    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb" // 바깥 클래스의 프로퍼티 접근
    }
    fun powerOn(): String {
        class Led(val color: String) {  // 이 클래스는 지역 클래스로 사용된다.
            fun blink(): String = "Blinking $color on $model" // 외부의 프로퍼티는 접근 가능
        }
        val powerStatus = Led("Red")
        val powerSwitch = object : Switcher {  // 익명 객체를 사용해 on()을 구현
            override fun on(): String {
                return powerStatus.blink()
            }
        }
        return powerSwitch.on()
    }
}

fun main() {
    val mySdcard = Smartphone("S7").ExternalStorage(32)
    println(mySdcard.getInfo())

    val myphone = Smartphone("Note9")
    myphone.ExternalStorage(128)
    println(myphone.powerOn())
}
