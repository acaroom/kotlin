package chap08.section1.variance

// 무변성(Invariance) 선언
//class Box<T>(val power: Int)

// 공변성(Covariance) 선언
//class Box<out T>(val power: Int)

// 반공변성(Contravariance) 선언
class Box<in T>(val size: Int)

fun main() {
    //val anys: Box<Any> = Box<Int>(10) // 에러! 자료형 불일치
    val nothings: Box<Nothing> = Box<Int>(20) // 관계 성립으로 객체 생성 가능
    println(nothings.size)
}