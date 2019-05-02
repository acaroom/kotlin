package chap05.section5.protectedtest

open class Base { // 최상위 선언 클래스에는 protected를 사용할 수 없다.
    protected var i = 1
    protected fun protectedFunc() {
        i += 1 // 접근 허용
    }
    fun access() {
        protectedFunc() // 접근 허용
    }
    protected class Nested // 내부 클래스에는 지시자 허용
}

class Derived : Base() {
    fun test(base: Base): Int {
        protectedFunc() // Base의 메서드 접근 가능
        return i // Base의 프로퍼티 접근 가능
    }
}

fun main() {
    val base = Base() // 생성 가능
    //base.i // 접근 불가
    //base.protectedFunc() // 접근 불가
    base.access() // 접근 가능
    val derived = Derived()
    derived.test(base)
    //derived.i // 접근 불가
    //derived.protectedFunc() // 접근 불가
}

