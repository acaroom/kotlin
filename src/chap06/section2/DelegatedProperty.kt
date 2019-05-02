package chap06.section2

import kotlin.properties.Delegates

class User {
    // observable은 값의 변화를 감시하는 일종의 콜백 루틴이다.
    var name: String by Delegates.observable("NONAME") {
        prop, old, new -> // 프로퍼티, 기존값, 새로운 값
        println("$old -> $new")
    }
}

fun main() {
    val user = User()
    user.name = "Kildong"
    user.name = "Dooly"
}