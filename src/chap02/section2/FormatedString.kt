package chap02.section2

fun main() {
    val num = 10
    val formatedString = """
        var a = 6
        var b = "Kotlin"
        println(a + num) // num의 값은 $num
        """
    println(formatedString)
}
