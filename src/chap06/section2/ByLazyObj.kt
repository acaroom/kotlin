package chap06.section2.bylazyobj

class Person(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false

    val person : Person by lazy {
        isPersonInstantiated = true
        Person("Kim", 23)
    }
    val personDelegate = lazy { Person("Hong", 40) }

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}")  // 이 시점에서 초기화
    println("personDelegate.value.name = ${personDelegate.value.name}")  // 이 시점에서 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}
