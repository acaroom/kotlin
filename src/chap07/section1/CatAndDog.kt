package chap07.section1

open class Animal(val name: String)

// feeding의 구현을 위해 인터페이스 Pet 지정
class Dog(name: String, override var category: String) : Animal(name), Pet {

    override var species: String = "dog"

    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master {

    // 1. 애완동물의 종류에 따라 오버로딩 되어야 한다.
/*
    fun playWithPet(dog: Dog) {
        println("Enjoy with my dog.")
    }
    fun playWithPet(cat: Cat) {
        println("Enjoy with my cat.")
    }
*/
    // 2. 인터페이스를 객체로 매개변수를 지정함
    fun playWithPet(pet: Pet) {
        println("Enjoy with my ${pet.species}.")
    }

}

fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}