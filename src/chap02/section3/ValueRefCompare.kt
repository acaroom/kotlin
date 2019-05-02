package chap02.section3

fun main() {
    val a: Int = 128
    val b = a
    println(a === b) // 자료형이 기본형인 int가 되어 값이 동일하기 때문에 true
    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d) // 내용만 비교하는 경우 동일하므로 true
    println(c === d) // 내용은 같지만 다른 객체(주소 다름)이므로 false
    println(c === e) // 내용은 같지만 같은 객체(주소 동일)이므로 true
}
