package chap03.section1

fun main() {  // 최초의 스택 프레임
    val num1 = 10 // 임시 변수 혹은 지역 변수
    val num2 = 3  // 임시 변수 혹은 지역 변수
    val result: Int

    result = max(num1, num2) // 두 번째 스택 프레임
    println(result)
}

fun max(a: Int, b: Int) = if (a > b) a else b // a와 b는 max의 임시 변수
