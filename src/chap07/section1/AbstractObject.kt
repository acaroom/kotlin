package chap07.section1

// 추상 클래스의 선언
abstract class Printer {
    abstract fun print()  // 추상 메서드
}

val myPrinter = object: Printer() { // 객체 인스턴스
    override fun print() {  // 추상 메서드의 구현
        println("출력합니다.")
    }

}

fun main() {
    myPrinter.print()
}
