package chap02.section2

fun main() {
    val a = 5  // 자료형 Int로 추론
    val b = 3
    // val c: Short = a + b // 에러! 자료형 불일치 에러 (Type mismatch)
    val c: Int = a + b
    println("a + b = <말풍선>${c}</말풍선#1>")
}
