package chap10.section3

import java.util.*

fun main() {

    // 기본 코틀린의 readLine()
    print("Enter: ")
    val input = readLine()!!
    println("You entered: $input")

    // 자바의 Scanner를 통한 입력
    val reader = Scanner(System.`in`)
    var integer:Int = reader.nextInt()
    println("You entered: $integer")
}

