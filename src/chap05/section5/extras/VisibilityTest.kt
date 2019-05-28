package chap05.section5.extras

open class Base {
    // 이 클래스에서는 a, b, c, d, e 접근 가능
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4  // 가시성 지시자 기본값은 public

    protected class Nested {
        public val e: Int = 5 // public 생략 가능
        private val f: Int = 6
        fun test() {
            println(Base().a)
            println(Base().b)
            println(Base().c)
            println(Base().d)
            println(e)
            println(f)
        }
    }
    fun test() {
        println(Base().a)
        println(Base().b)
        println(Base().c)
        println(Base().d)
        println(Nested().e)
        //println(Nested().f)
    }
}

class Derived : Base() {
    // a 는 접근 불가
    // b, c, d 는 여기서 접근 가능
    // Nested 클래스의 e도 접근 가능
    override val b = 5   // Base의 'b' 는 오버라이딩 됨
    fun test(base: Base) {
        //println(base.a)
        println(super.b)
        println(b)
        println(base.c)
        println(base.d)
        println(Nested().e)
        //println(Nested().f)
    }
}
class Other(base: Base) {
    // base.a, base.b는 접근 불가
    // base.c 와 base.d 는 접근 가능(같은 모듈안에 있으므로)
    // Base.Nested 는 접근 불가, Nested::e 역시 접근 불가
}

