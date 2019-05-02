package chap09.section3

fun main() {
    val mixedTypesSet = setOf("Hello", 5, "world", 3.14, 'c') // 자료형 혼합 초기화
    var intSet: Set<Int> = setOf<Int>(1, 5, 5)  // 정수형만 초기화

    println(mixedTypesSet)
    println(intSet)
}