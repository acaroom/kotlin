package chap03.section1

fun main() {

    val name = "홍길동"
    val email = "hong@example.kr"

    add(name)
    add(name, email)
    add("둘리", "dooly@example.kr")
    defaultArgs()        // 100 + 200
    defaultArgs(200)  // 200 + 200
}

fun add(name: String, email: String = "default") {
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x: Int = 100, y: Int = 200) {
    println(x + y)
}
