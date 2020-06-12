package extra

fun main() {

    val a0: UByte = 2u
    val a1: UByte = 19u

    val mask: UByte = 0xFu

    val lower_4: UByte = a1 and mask
    println(lower_4)

}