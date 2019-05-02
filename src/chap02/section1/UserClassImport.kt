package chap02.section1

import com.example.edu.Person as User

fun main() {

    val user1 = User("Kildong", 30) // com.example.edu의 Person이 User로 대체
    val user2 = Person("A123", "Kildong") // 이 파일 내에 있는 Person 클래스의 객체 생성

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)
}

class Person(val id: String, val name: String)
