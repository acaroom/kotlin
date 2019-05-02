package chap03.section1

fun main() {

    varargsParams("Hello", "World", "Kotlin")
    varargsParams(1, 2, 3, 4)
}

fun <T> varargsParams(vararg ts: T) {
    for (t in ts) {
        println(t)
    }
}