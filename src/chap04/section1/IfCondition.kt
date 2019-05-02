package chap04.section1

fun main() {

    val a = 12
    val b = 7

    // 블록과 함께 사용
    val max = if (a > b) {
        println("Choose a")
        a  // 마지막 식인 a가 반환되 max에 할당
    }
    else {
        println("Choose b")
        b // 마지막 식인 b가 반환되 max에 할당
    }

    println(max)
}