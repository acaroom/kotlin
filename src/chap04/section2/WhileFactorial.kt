package chap04.section2

fun main() {

    print("Enter the number: ")
    var number = readLine()!!.toInt()
    var factorial: Long = 1

    while (number > 0) { // n x ... x 4 x 3 x 2 x 1
        factorial *= number
        --number
    }

    println("Factorial: $factorial")
}