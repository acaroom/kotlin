package chap03.section3

fun main() {

    normal()
    greet() // What does it print?
    greetAnon() // 익명의 함수
}

fun normal() { println("Hello") }

fun greet() = { println("Hello") }

fun greetAnon() = fun() { println("Hello") }