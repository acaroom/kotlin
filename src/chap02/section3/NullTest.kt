package chap02.section3

fun main() {

    // 1단계: Null 에러 발생
//    var str1 : String = "Hello Kotlin"
//    str1 = null // 기본적으로 null을 허용하지 않으므로 에러
//    println("str1: $str1")

    // 2단계: Null 검사 에러 발생
//    var str1 : String? = "Hello Kotlin"  // null 허용
//    str1 = null
//    println("str1: $str1 length: ${str1.length}")  // null을 허용하면 legnth가 실행될 수 없다.


    // 3단계: Null 검사 안전 호출 ?. 과 NPE 발생
//    var str1 : String? = "Hello Kotlin"  // null 허용
//    str1 = null
//    //println("str1: $str1 length: ${str1?.length}")  // ?.을 사용해 안전 호출
//    println("str1: $str1 length: ${str1!!.length}")  // NPE 강제 발생

    // 4단계: Null 검사
    var str1 : String? = "Hello Kotlin"
    str1 = null
    val len = if(str1 !=null) str1.length else -1
    println("str1: $str1 length: ${len}")


}
