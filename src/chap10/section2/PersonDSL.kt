package chap10.section2

data class Person(
        var name: String? = null,
        var age: Int? = null,
        var job: Job? = null)

data class Job(
        var category: String? = null,
        var position: String? = null,
        var extension: Int? = null)

// Version 1
//fun person(block: (Person) -> Unit): Person {
//    val p = Person()
//    block(p)
//    return p
//}

// Version 2
//fun person(block: Person.() -> Unit): Person {
//    val p = Person()
//    p.block()
//    return p
//}

// Version 3
fun person(block: Person.() -> Unit): Person = Person().apply(block)

fun Person.job(block: Job.() -> Unit) {
    job = Job().apply(block)
}

fun main() {
    val person = person {
        name = "Kildong"
        age = 40
        job {
            category = "IT"
            position = "Android Developer"
            extension = 1234
        }
    }

    println(person)
}