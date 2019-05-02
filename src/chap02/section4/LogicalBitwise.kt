package chap02.section4

fun main() {
    val number1 = 12
    val number2 = 25

    println(number1 or number2)   // result = number1.or(number2) 와 동일
    println(number1 and number2)   // result = number1.and(number2) 와 동일
    println(number1 xor number2)   // result = number1.xor(number2) 와 동일
}