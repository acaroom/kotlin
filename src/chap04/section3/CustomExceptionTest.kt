package chap04.section3

class InvalidNameException(message: String) : Exception(message) // ① 사용자 예외 클래스

fun main() {

    var name = "Kildong123" // ② 숫자가 포함된 이름

    try {
        validateName(name)
    } catch (e : InvalidNameException){ // ③ 숫자가 포함된 예외 처리
        println(e.message)
    } catch (e : Exception){ // 기타 예외 처리
        println(e.message)
    }

}

fun validateName(name : String){
    if(name.matches(Regex(".*\\d+.*"))) { // ④ 이름에 숫자가 포함되어 있으면 예외 발생시킴
        throw InvalidNameException("Your name : $name : contains numerals.")
    }
}
