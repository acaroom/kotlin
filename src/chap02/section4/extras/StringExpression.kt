package chap02.section4.extras

fun main() {

    var a = 1
    val str1 = "a = $a"
    val str2 = "a = ${a + 2}" // 표현식의 사용

    println("str1: \"$str1\", str2: \"$str2\"")
}