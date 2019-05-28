package chap03.section3.label

fun main() {
    shortFunc(3) {
        println("First call: $it")
        return@shortFunc
    }
}

fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}