package chap04.section3

fun main() {

    // 익명함수 방법
/*
    val getMessage = fun(num: Int): String {
        if(num !in 1..100) {
            return "Error"
        }
        return "Success"
    }
*/

    // 람다식 방법
    val getMessage = lambda@ { num: Int ->
        if(num !in 1..100) {
            return@lambda "Error"
        }
        "Sucess"
    }

    println(getMessage(100))

}