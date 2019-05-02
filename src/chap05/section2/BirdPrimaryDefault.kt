package chap05.section2.default

// 프로퍼티의 기본값 지정
class Bird(var name: String = "NONAME", var wing: Int = 2, var beak: String, var color: String) {

    // 초기화 블록
    init {
        println("----------constructor----------")
        println("The name is $name, The beak is $beak")
        this.sing(3)
        println("-------end of constructor------")
    }

    // 메서드들
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {

//    val coco = Bird("mybird", 2, "short", "blue")
    val coco = Bird(beak = "long", color = "red")

    println("coco.name: ${coco.name}, coco.wing ${coco.wing}")
    println("coco.color: ${coco.color}, coco.beak ${coco.beak}")
}
