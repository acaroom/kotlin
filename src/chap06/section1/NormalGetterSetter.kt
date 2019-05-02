package chap06.section1

// 직접 구성한 기본 게터/세터
class User(_id: Int, _name: String, _age: Int) {
    // 프로퍼티들
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val user1 = User(1, "Kildong", 30)
    // user1.id = 2  // val 프로퍼티는 값 변경 불가
    user1.age = 35 // 세터
    println("user1.age = ${user1.age}") // 게터
}
