package chap02.section3

fun main() {
//    val a = Integer(128)
//    val b = Integer(128)
    val a: Int = 128
    val b: Int = 128
    val c = a
    val d = a
    println("a == b ${a == b}")
    println("a === b ${a === b}")
    println("a == c ${a == c}")
    println("a === c ${a === c}")
    println("c == d ${c == d}")
    println("c === d ${c === d}")

    val e: Int? = 128
    val f: Int? = 128
    val g: Int? = e
    val h: Int? = a
    println("e == f ${e == f}")
    println("e === f ${e === f}")
    println("e == g ${e == g}")
    println("e === g ${e === g}")
    println("g == h ${g == h}")
    println("g === h ${g === h}")
}

