package chap11.section4

var global = 20

@Synchronized fun synchronizedMethod() {
    global += 1
    println("${Thread.currentThread()} global = ${global}")
}

fun main() {
    synchronizedMethod()
}