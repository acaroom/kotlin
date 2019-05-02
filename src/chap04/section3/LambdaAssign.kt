package chap04.section3

fun main() {


    greet() // 아무것도 출력되지 않는다
    greet()()

}

//fun greet() = { println("Hello") }
fun greet() = fun() { println("Hello") }