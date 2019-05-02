package chap02.section2

fun main() {

    val ch = 'a'
    println(ch + 1)
    println('a'.toInt())
    println('A'.toInt())

    val kor = '\uD55C'
    println(kor)

    val code: Int = 65
    val chFromCode: Char = code.toChar() // code에 해당하는 문자를 할당
    println(chFromCode)

    val num01: Byte = 127
    val num02: Short = -32768
    val num03: Int = 2147483647
    val num04: Long = 9223372036854775807

    println("$num01\n$num02\n$num03\n$num04")

    val num05 = 127 // Int로 추론
    val num06 = -32768 // Int로 추론
    val num07 = 2147483647 // Int로 추론
    val num08 = 9223372036854775807 // Long으로 추론


}