package chap10.section1

fun main() {

    // 기본 사용법
    var skills = "Kotlin"
    println(skills) // Kotlin

    val a = 10
    skills = run {
        val level = "Kotlin Level:" + a
        level
    }
    println(skills) // Kotlin Level:10

    // let과 함께 사용
    var p : String? = null
    p?.let { println("p is $p") } ?: run {
        println("p was null. Setting default value to: ")
        p = "Kotlin"
    }

    println(p)


    // let과 비교
    StringBuilder().let {
        it.append("content: ")
        it.append(it.javaClass.canonicalName)
    }.print()

    StringBuilder().run {
        append("content: ")
        append(javaClass.canonicalName)
    }.print()

    // apply와 run 비교
    data class Person(var name: String, var skills : String)
    var person = Person("Kildong", "Kotlin")

    val retrunObj = person.apply {
        this.name = "Sean"
        this.skills = "Java"
        "success"
    }
    println(person)
    println("retrunObj: $retrunObj")

    val retrunObj2 = person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "success"
    }
    println(person)
    println("retrunObj2: $retrunObj2")

}

fun Any.print() = println(this)