package chap02.section4.extras

fun main() {

    var check = (5>3) && (5>2)  // 두개의 항이 모두 참일 때 true
    println(check)

    check = (5>3) || (2>5)      // 두개중 하나의 항이 참일 때 true
    println(check)

    check = !(5>3)              // 참인 경우 거짓으로, 거짓인 경우 참으로 변경
    println(check)
}
