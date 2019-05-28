package chap03.section3

fun main() {

    var result: Int

    // 1. 일반 변수에 람다식 할당 ((1)~(3)의 선언은 모두 같음)
//    val multi = {x: Int, y: Int -> x * y}  // (1) 선언부 생략, 람다식 선언에만 자료형 지정
//    val multi: (Int, Int) -> Int = {x: Int, y: Int -> x * y} // (2) 람다식, 선언부 자료형 지정
    val multi: (Int, Int) -> Int = {x, y -> x * y}  //  (3) 선언부만 자료형 지정
//    val multi = {x, y -> x * y} // 모든 선언을 제거하면 에러! 추론이 가능하지 않음

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