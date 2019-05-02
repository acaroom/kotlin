package chap06.section3

class Outer {
    // Private function -> 반환 타입은 익명 객체 타입이 된다
    private fun foo() = object {
        val x: String = "x"
    }

    // Public function -> 반환 타입은 Any가 된다
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x        // 문제없음
        //val x2 = publicFoo().x  // ERROR: Unresolved reference 'x'
    }
}
