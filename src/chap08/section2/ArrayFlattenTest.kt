package chap08.section2

fun main() {
    val numbers = arrayOf(1, 2, 3)
    val strs = arrayOf("one", "two", "three")
    val simpleArray = arrayOf(numbers, strs) // 2차원 배열
    simpleArray.forEach { println(it) }

    val flattenSimpleArray = simpleArray.flatten() // 단일 배열로 변환하기
    println(flattenSimpleArray)
}