package chap08.section2.extras

import java.util.*

fun main() {

    val arr = intArrayOf(1,2,3,4,5)
    println("arr: ${Arrays.toString(arr)}")

    val arr2 = arrayOf(1,2,3,"hello", true)
    println("arr2: ${Arrays.toString(arr2)}")

    val arr3 = Array(5, {i -> i * 2})
    println("arr3: ${Arrays.toString(arr3)}")

    val arr4 = arrayOf(arr, arr2, intArrayOf(7,8,9))
    println("arr4: ${Arrays.deepToString(arr4)}")

    var arr5 = arrayOfNulls<Int>(1000)
    println("arr5: ${Arrays.toString(arr5)}")

    var arr6 = Array(100, {0})
    println("arr6: ${Arrays.toString(arr6)}")


    arr.forEach { a -> println(a) }
    arr.forEachIndexed({i, a -> println("index: $i, element: $a")})

}