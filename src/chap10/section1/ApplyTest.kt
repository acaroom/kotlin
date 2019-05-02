package chap10.section1

fun main() {
    data class Person(var name: String, var skills : String)
    var person = Person("Kildong", "Kotlin")

    // 여기서 this는 person 객체를 가리키게 된다.
    person.apply { this.skills = "Swift" }
    println(person)

    val retrunObj = person.apply {
        name = "Sean" // this는 생략할 수 있다.
        skills = "Java" // this없이 객체의 멤버를 여러번 접근한다.
    }
    println(person)
    println(retrunObj)

}