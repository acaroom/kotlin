package chap02.section3

fun main() {
    var str1 : String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length: ${str1?.length ?: -1}") // 세이프 콜과 엘비스 연산자 활용
}

