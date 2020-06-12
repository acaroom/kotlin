package extra

import kotlin.math.floor

fun main() {

    val num: Double = 0.0449999
    val num3digits: Double = String.format("%.3f", num).toDouble()
    val num2digits: Double = String.format("%.2f", num3digits).toDouble()
    println(num3digits)
    println(num2digits)

}