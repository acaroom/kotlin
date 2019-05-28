package chap03.section5.extras

fun main() {

    normal()
    greet() // 무엇이 프린트 될까요?
    greetAnon() // 익명의 함수
}

fun normal() { println("Hello") }

fun greet() = { println("Hello") }

fun greetAnon() = fun() { println("Hello") }