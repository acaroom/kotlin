package chap10.section1.extras

fun main() {
    var a = 1
    val b = 2

    a = a.let { it + 2 }.let {
        println("a = $a")
        val i = it + b
        i
    }
    println(a) // 5
}