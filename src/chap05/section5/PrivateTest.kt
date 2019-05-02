package chap05.section5.privatetest

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1 // 접근 허용
    }
    fun access() {
        privateFunc() // 접근 허용
    }
}

class OtherClass {
    //val pc = PrivateClass()  // 프로퍼티로 객체 지정 불가 (private로 선언해야함)
    fun test() {
        val pc = PrivateClass() // 생성 가능
    }
}

fun main() {
    val pc = PrivateClass() // 생성 가능
    // pc.i // 접근 불가
    // pc.privateFunc() // 접근 불가
}

fun TopFunction() {
    val tpc = PrivateClass() // 객체 생성 가능
}