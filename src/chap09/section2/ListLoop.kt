package chap09.section2

fun main() {
    val fruits = listOf("apple", "banana", "kiwi")

    // 요소만 출력
    for (item in fruits) {
        println(item)
    }

    // 인덱스와 함께 출력
    for (index in fruits.indices) { // 인덱스 지정
//        println("fruits[$index] = ${fruits[index]}")
        if (index%2 == 0) println("fruits[$index] = ${fruits[index]}") // 짝수만 고르기
    }

    // while 루프 이용하기
    var index = 0
    while (index < fruits.size) {
        println("fruits[$index] = ${fruits[index]}")
        index++
    }


}