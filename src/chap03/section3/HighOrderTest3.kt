package chap03.section3

fun main() {

    // 반환값이 없는 람다식의 선언
    val out: () -> Unit = { println("Hello World!") }
    // 혹은 val out = { println("Hello World!") }
    // 람다식이 들어있는 변수를 다른 변수에 할당

    out() // 함수처럼 사용가능
    val new = out // 변수처럼 할당해 재사용 가능
    new()

}


