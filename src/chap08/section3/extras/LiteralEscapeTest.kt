package chap08.section3.extras

fun main() {

    val str = "\tYou're just too \"good\" to be true\n\tI can't take my eyes off you."
    val uni = "\uAC00" // 한글 코드의 범위 AC00-D7AF

    println(str)
    println(uni)

    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin() // trim default는 |
    println(text)

    val pi = 3.1415926
    val dec = 10
    val s = "hello"
    println("pi = %.2f, %e, %3d, %x, %s".format(pi, pi, dec, dec, s))

    val number: Int = "123".toInt()

}