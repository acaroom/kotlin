package chap03.section5.extras

fun main() {

    // 1. 선언부 포함 익명 함수
    val add: (Int, Int) -> Int = fun(x, y) = x + y

    // 2. 선언부 생략 익명 함수
//    val add = fun(x: Int, y: Int) = x + y

    // 3. 람다식 함수
//    val add = {x: Int, y: Int -> x + y }

    // 1~3 모두 동일한 결과
    val result = add(10, 2)
    println(result)


}