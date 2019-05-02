package chap09.section4

fun main() {
    // resersed: 뒤집힌 순서의 컬렉션 반환
    val unsortedList = listOf(3, 2, 7, 5)
    println(unsortedList.reversed()) // [5, 7, 2, 3]

    // sort: 요소를 정렬 후 정렬된 컬렉션 반환
    println(unsortedList.sorted()) // [2, 3, 5, 7]
    // 내림차순 정렬
    println(unsortedList.sortedDescending()) // [7, 5, 3, 2]

    // sortBy: 특정 비교식에 의해 정렬된 컬렉션 반환
    println(unsortedList.sortedBy { it % 3 }) // [3, 7, 2, 5]
    println(unsortedList.sortedByDescending { it % 3 }) // [2, 5, 7, 3]
}