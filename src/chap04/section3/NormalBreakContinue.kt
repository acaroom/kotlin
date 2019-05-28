package chap04.section3

fun main() {
    for (i in 1..5) {
        if (i==3) continue //또는 break // for문 자체가 중단됨
        print(i)
    }
    println()
    println("outside")
}