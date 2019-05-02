package chap05.section2.primary

// 1. 주 생성자 선언
//class Bird constructor(_name: String, _wing: Int, _beak: String, _color: String) {
//    // 프로퍼티들
//    var name: String = _name
//    var wing: Int = _wing
//    var beak: String = _beak
//    var color: String = _color


// 2. 주 생성자 선언 생략된 표현법
class Bird(var name: String, var wing: Int, var beak: String, var color: String) { // constructor 생략
    // 프로퍼티들
    // 매개 변수내에 프로퍼티로서 선언되어 본문에서 생략됨

    // 메서드들
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {

    val coco = Bird("mybird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}

