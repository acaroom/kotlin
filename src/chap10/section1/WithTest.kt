package chap10.section1

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)

    val user = User("Kildong", "default")

    val result = with (user) {
        skills = "Kotlin"
        email = "kildong@example.com"
        "Success"
    }
    println(user)
    println("result: $result")

}