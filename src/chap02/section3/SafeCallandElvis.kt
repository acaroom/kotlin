package chap02.section3

fun main() {
    var str1 : String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length: ${str1?.length ?: -1}")
}

