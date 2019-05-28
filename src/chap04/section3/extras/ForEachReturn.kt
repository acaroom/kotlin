package chap04.section3.extras

fun main() {
    foo(listOf(1, 0, 3, 4))
}

fun foo(ints: List<Int>) {
    println("In Foo")
    ints.forEach inner@ {
        if (it == 0) return@inner

        println(it)
    }
    println("Hii there")
}