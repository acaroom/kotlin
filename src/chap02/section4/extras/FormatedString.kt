package chap02.section4.extras

    fun main() {

        // 단계1: 기본 사용
//        val num = 10
//        val formatedString = """
//        var a = 6
//        var b = "Kotlin"
//        println(a + num) // num의 값은 $num
//        """
//        println(formatedString)

    // 단계2: 특정 구분자를 사용해 공백 잘라내기
    val num = 10
    val formatedString = """
        |var a = 6
        |var b = "Kotlin"
        |println(a + num) // num의 값은 $num
        """
    println(formatedString.trimMargin("|"))
}

