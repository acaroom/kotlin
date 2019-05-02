package chap02.section2

fun main() {
    var a = 1
    val str1 = "a = $a"
    val str2 = "a = ${a + 2}" // 문자열에 표현식 사용

    println("str1: \"$str1\", str2: \"$str2\"")
}
