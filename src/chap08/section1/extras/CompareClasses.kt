package chap08.section1.extras

import java.util.*

fun <T> myMax(a: T, b: T): T where T:Number, T:Comparable<T> {
    return if (a > b) a else b
}

data class Product(val name: String, val releasedDate: Date) : Comparable<Product> {

    override fun compareTo(other: Product) = when {
        releasedDate < other.releasedDate -> -1
        releasedDate > other.releasedDate -> 1
        else -> 0
    }

}

fun main() {

    val date1 = Date(2007, 6, 29)
    val date2 = Date(2010, 4, 3)


}