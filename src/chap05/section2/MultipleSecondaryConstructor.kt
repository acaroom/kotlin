package chap05.section2.multiple

// 주 생성자가 없고 여러개의 보조 생성자를 가진 클래스
class Bird {
    // 프로퍼티들
    var name: String
    var wing: Int
    var beak: String
    var color: String

    // 부 생성자 1
    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }

    // 부 생성자 2
    constructor(_name: String, _beak: String) {
        name = _name
        wing = 2
        beak = _beak
        color = "grey"
    }

    // 메서드들
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {

    val coco = Bird("mybird", 2, "short", "blue")
    val mybird2 = Bird("mybird2", "long")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}


