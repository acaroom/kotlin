package chap05.section4

open class A {
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}

interface B {
    fun f() = println("B Inteface f()") // 인터페이스는 기본적으로 open이다.
    fun b() = println("B Inteface b()")
}

class C : A(), B {
    // 컴파일 되려면 f()가 오버라이딩 되어야 한다.
    override fun f() = println("C Class f()")

    fun test() {
        f()  // 현재 클래스의 f()
        b()  // 인터페이스 B의 b()
        super<A>.f() // A킅래스의 f()
        super<B>.f() // B클래스의 f()
    }

}

fun main() {
    val c = C()
    c.test()
}