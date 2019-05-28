package chap08.section2.extras

import java.util.*

fun main() {
    val arr = intArrayOf(1,2,3,4,5)
    println("arr: ${Arrays.toString(arr)}")

    // 하나의 요소를 추가한 새 배열 생성
    val arr2 = arr.plus(6)
    println("arr2: ${Arrays.toString(arr2)}")

    // 필요한 범위를 잘라내 새 배열 생성
    val arr3 = arr.sliceArray(0..2)
    println("arr3: ${Arrays.toString(arr3)}")

    // 첫번째와 마지막 요소 확인
    println(arr.first())
    println(arr.last())

    // 요소 3의 인덱스 출력
    println("indexOf(3): ${arr.indexOf(3)}")

    // 배열의 평균 값 출력
    println("average: ${arr.average()}")

    // count에 의한 요소 갯수
    println("count: ${arr.count()}")

    // 요소가 포함되었는지 확인
    println(arr.contains(4))

    // forEach에 의한 요소 순환
    arr.forEach { element -> print("$element ") }
    println()

    // forEachIndexed에 의한 요소 순환
    arr.forEachIndexed({i, e -> println("arr[$i] = $e")})

    // Iterator를 사용한 요소 순환
    val iter: Iterator<Int> = arr.iterator()
    while(iter.hasNext()) {
        val e = iter.next()
        print("$e ")
    }

}
