package chap07.section1

interface Pet {
    var category: String // abstract 키워드가 없어도 기본은 추상 프로퍼티
    val msgTags: String  // val 선언 시 게터의 구현이 가능
        get() = "I'm your lovely pet!"

    var species: String // 종을 위한 프로퍼티
    fun feeding() // 마찬가지로 추상 메서드
    fun patting() { // 비-추상 메서드: 구현부를 포함하면 비-추상이 되며 기본 구현이 된다.
        println("Keep patting!") // 구현부
    }
}

class Cat(name: String, override var category: String) : Pet, Animal(name) {

    override var species: String = "cat" // 프로퍼티를 오버라이딩해 종을 특정한다.

    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat("Bill", "small")
    println("Pet Category: ${obj.category}")
    println("Pet Message Tags: ${obj.msgTags}")
    obj.feeding() // 구현된 메서드
    obj.patting() // 기본 메서드
}
