package chap10.section1

fun main() {

    // also의 기본 개념
    var m = 1
    m = m.also { it + 3 }
    println(m) // 원본값 1

    // 활용
    data class Person(var name: String, var skills : String)
    var person = Person("Kildong", "Kotlin")

    val a = person.let {
        it.skills = "Android"
        "sucess" // 마지막 문장을 결과로 반환
    }
    println(person)
    println("a: $a")
    val b = person.also {
        it.skills = "Java"
        "success" // 마지막 문장은 사용되지 않음
    }
    println(person)
    println("b: $b")
}