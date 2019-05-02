package chap08.section2

import java.util.Arrays // Arrays를 사용하기 위해

fun main() {

    val arr = intArrayOf(1,2,3,4,5)
    println("arr: ${Arrays.toString(arr)}")
    println("power: ${arr.size}")
    println("sum(): ${arr.sum()}")

    // 게터/세터에 의한 접근과 index 연산자 표기법
    println(arr.get(2))
    println(arr[2])

    arr.set(2, 7)
    arr[0] = 8
    println("power: ${arr.size} arr[0]: ${arr[0]}, arr[2]: ${arr[2]}")

    // 루프를 통한 배열 요소의 접근
    for (i in 0..arr.size -1) {
        println("arr[$i] = ${arr[i]}")
    }

    println(arr.contains(4))
    println(4 in arr)

}