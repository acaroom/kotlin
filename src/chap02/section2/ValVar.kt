package chap02.section2

fun main() {

    val number = 10  // number는 Int로 추론
    var language = "Korean" // language는 String으로 추론
    val secondNumber: Int = 20 // sercondNumber는 자료형을 Int로 명시적으로 지정
    language = "English" // var 선언이므로 변수의 값을 재할당 할 수 있다.

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")
}