package chap07.section2

class Outer {
    val ov = 5
    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello ! $nv" // 외부의 ov에는 접근 불가
        fun accessOuter() { // 컴페니언 객체는 접근할 수 있다.
            println(country)
            getSomething()
        }
    }
    fun outside() {
        val msg = Nested().greeting() // 객체 생성 없이 중첩 클래스의 메서드 접근
        println("[Outer]: $msg, ${Nested().nv}") // 중첩 클래스의 프로퍼티 접근
    }
    companion object { // 컴페니언 객체는 static 처럼 접근 가능
        const val country = "Korea"
        fun getSomething() = println("Get something...")
    }
}

fun main() {
    // static 처럼 객체 생성 없이 사용된다.
    val output = Outer.Nested().greeting()
    println(output)
    Outer.Nested().accessOuter()

   // Outer.outside()  // 에러! 외부 클래스의 경우는 객체를 생성해야 한다
    val outer = Outer()
    outer.outside()
}
