package chap09.section4

fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)

    val reversed = list.reversed()
    val asReversed = list.asReversed()

    println("reversed: $reversed")
    println("asReversed: $asReversed")

    list[0] = 10
    println("reversed: $reversed")
    println("asReversed: $asReversed")


}