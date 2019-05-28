package chap04.section3.anon

fun main() {

    retFunc()
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) { // inline이 제거됨
    out(a, b)
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3, fun (a, b) {
        val result = a + b
        if(result > 10) return
        println("result: $result")
    }) // end of inlineLambda()
    println("end of retFunc")
}