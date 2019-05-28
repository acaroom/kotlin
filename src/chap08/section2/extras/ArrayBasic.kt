package chap08.section2.extras

fun main() {
    val numbers = arrayOf(4, 5, 7, 3)
    val animals = arrayOf("Cat", "Dog", "Lion")

    for (element in numbers) {
        print("$element, ")
    }
    println()
    for (e in animals) print("$e, ")

}