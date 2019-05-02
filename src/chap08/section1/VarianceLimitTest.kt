package chap08.section1.limit

open class Animal(val size: Int) {
    fun feed() = println("Feeding...")
}

class Cat(val jump: Int): Animal(50)
class Spider(val poison: Boolean): Animal(1)

// (1) 형식 매개변수를 Animal로 제한 한다.
class Box<out T: Animal>(val element: T) { // 주생성자에서 val만 허용한다.
    fun getAnimal(): T = element // (2) out은 반환 자료형에 만 사용할 수 있다.
//    fun set(new: T) { // (3) 에러! T는 in 위치에 사용할 수 없다.
//        element = new
//    }
}

fun main() {

    // 일반적인 객체 선언
    val c1: Cat = Cat(10)
    val s1: Spider = Spider(true)

    // 클래스의 상위 자료형 캐스팅은 아무런 문제가 없다
    var a1: Animal = c1
    a1 = s1 // (4) a1은 이제 Spider의 객체가 된다
    println("a1.power = ${a1.size}")

    // (5) 공변성(Covariance) - Cat은 Animal의 하위 자료형이다.
    val c2: Box<Animal> = Box<Cat>(Cat(10))
    println("c2.element.power = ${c2.element.size}")

    // (6) 반대의 경우는 가능하지 않다.
//    val c3: Box<Cat> = Box<Animal>(10) // 에러!

    // (7) 자료형을 제한하여 Animal과 하위 클래스 이외에는 사용할 수 없다.
//    val c4: Box<Any> = Box<Int>(10) // 에러!

}
