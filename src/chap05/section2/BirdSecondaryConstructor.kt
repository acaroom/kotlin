package chap05.section2.secondary

class Bird {
    // 프로퍼티들
    var name: String
    var wing: Int
    var beak: String
    var color: String

    // 1. 부 생성자
//    constructor(name: String, wing: Int, beak: String, color: String) {
//        this.name = name
//        this.wing = wing
//        this.beak = beak
//        this.color = color
//    }

    // 2. 부 생성자 (이름이 다른 스타일)
    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }

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


