package chap06.section1

open class First {
    open val x: Int = 0
      get() {
          println("First x")
          return field
      }
    val y: Int = 0 // open 키워드가 없으면 final 프로퍼티임
}

class Second : First() {
    override val x: Int = 0
      get() { // 부모와 구현이 다름
          println("Second x")
          return field + 3
      }
    // override val y: Int = 0 // 에러! 오버라이딩 불가
}

fun main() {
    val second = Second()
    println(second.x) // 오버라이딩된 두번째 클래스 객체의 x
    println(second.y) // 부모로 부터 상속 받은 값
}