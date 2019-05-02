package chap03.section3

fun main() {

    var result: Int

    // 1. 일반 변수에 람다식 할당
//  val multi = {x: Int, y: Int -> x * y}
    //val multi: (Int, Int) -> Int = {x: Int, y: Int -> x * y}
    val multi: (Int, Int) -> Int = {x, y -> x * y}
    // val multi = {x, y -> x * y} // 에러! 추론이 가능하지 않음

    // 람다식 본문이 여러줄인 경우
    val multi2: (Int, Int) -> Int = { x: Int, y: Int ->
        println("x * y")
        x * y  // 마지막 표현식이 반환됨
    }


    // 람다식이 할당된 변수는 함수처럼 사용 가능
    result = multi(10, 20)
    println(result)
    println(multi2(10, 20))
}