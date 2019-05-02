package chap02.section2

fun main() {

    val exp01 = 123     // exp01은 Int로 추론
    val exp02 = 123L    // exp02는 Long으로 추론
    val exp03 = 0x0F    // 16진 표기가 사용된 Int 값
    val exp04 = 0b00001011 // 2진 표기가 사용된 Int 값
    val exp05 = 123.5   // exp05는 Double로 추론
    val exp06 = 123.5e10 // 지수 표현법이 사용된 Double 값
    val exp07 = 123.5f  // exp07은 Float로 추론

    val exp08: Byte = 127 // 명시적으로 자료형을 지정하면 해당 자료형의 값 저장
    val exp09 = 32767 // 값이 Short 범위에 있으나 Int로 추론
    val exp10: Short = 32767 // 명시적으로 자료형 Short를 지정
    val exp11 = 2147483647 // 값이 Int범위에 있으므로 Int로 추론
    val exp12 = 9223372036854775807 // 값의 범위가 Long형 범위에 있으므로 Long으로 추론
    val exp13 = true // exp13은 Boolean으로 추론
    val exp14 = 'c' // exp14는 Char로 추론
    val exp15 = '\u0061' // 유니코드(unicode) 표현법으로 Char 지정

    println("$exp01\n$exp02\n$exp03\n$exp04\n$exp05\n$exp06\n$exp07\n")
    println("$exp08\n$exp09\n$exp10\n$exp11\n$exp12\n$exp13\n$exp14\n$exp15")

}