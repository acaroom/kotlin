package chap04.section3

fun main() {

    retFunc()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3) { a, b ->
        val result = a + b
        if(result > 10) return // 10보다 크면 이 함수를 빠져 나감
        println("result: $result") // 10보다 크면 이 문장에 도달하지 못함
    }
    println("end of retFunc")
}