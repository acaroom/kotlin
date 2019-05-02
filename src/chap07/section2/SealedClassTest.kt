package chap07.section2

// 1. 실드 클래스 선언 방법 첫번째 스타일
sealed class Result {
    open class Success(val message: String): Result()
    class Error(val code: Int, val message: String): Result()
}

class Status: Result() // 실드 클래스 상속은 같은 파일에서만
class Inside: Result.Success("Status") // 내부 클래스 상속

// 2. 실드 클래스 선언 방법 두번째 스타일
/*
sealed class Result

open class Success(val message: String): Result()
class Error(val code: Int, message: String): Result()

class Status: Result()
class Inside: Success("Status")
*/


fun main() {
    // Success에 대한 객체 생성
    val result = Result.Success("Good!")
    val msg = eval(result)
    println(msg)
}

// 상태를 검사하기 위한 함수
fun eval(result: Result): String = when(result) {
    is Status -> "in progress"
    is Result.Success -> result.message
    is Result.Error -> result.message
    // 모든 조건을 가지므로 else 가 필요 없다
}
