package chap04.section1

fun main() {

    print("Enter the score: ")
    val score = readLine()!!.toDouble() // 콘솔로부터 입력 받는다
    var grade: Char = 'F'

    // 1. 논리합으로 연결된 조건
    if (score >= 90.0) {
        grade = 'A'
    } else if (score >= 80.0 && score <= 89.9) {
        grade = 'B'
    } else if (score >=70.0 && score <= 79.9) {
        grade = 'C'
    }

    // 2. 범위 지정자로 연결된 조건
    if (score >= 90) {
        grade = 'A'
    } else if (score in 80.0..89.9) {
        grade = 'B'
    } else if (score in 70.0..79.9) {
        grade = 'C'
    }

    println("Score: $score, Grade: $grade")
}