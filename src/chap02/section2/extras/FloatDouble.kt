package chap02.section2.extras

fun main() {
    val exp01 = 3.14  // 기본적으로 Double형으로 추론
    val exp02 = 3.14F // 형식문자 F에 의해 Float형으로 추론
    val exp03 = 3.14E-2 // 왼쪽으로 소수점 자리 이동, Double로 추론
    val exp04 = 3.14e2f //  오른쪽으로 소수점 자리 이동, Float로 추론

    println("exp01: $exp01, exp02: $exp02, exp03: $exp03, exp04: $exp04")
}