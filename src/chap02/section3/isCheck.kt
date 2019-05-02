package chap02.section3

fun main() {

    val num = 256

    if (num is Int) { // num이 Int형 일때
        print(num)
    } else if (num !is Int) { // num이 Int형이 아닐 때, !(num is Int) 와 동일
        print("Not a Int")
    }
}