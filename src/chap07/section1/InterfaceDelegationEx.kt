package chap07.section1

interface Nameable {
    var name: String
}

class StaffName : Nameable {
    override var name: String = "Sean"
}

class Work: Runnable { // 스레드 실행을 위한 인터페이스 구현
    override fun run() {
        println("work...")
    }
}

// 각 매개변수에 해당 인터페이스를 위임한다.
class Person(name: Nameable, work: Runnable): Nameable by name, Runnable by work

fun main() {
    val person = Person(StaffName(), Work()) // 생성자를 사용해 객체 바로 전달
    println(person.name) // 여기서 StaffName클래스의 name 접근
    person.run() // 여기서 Work클래스의 run 접근
}
