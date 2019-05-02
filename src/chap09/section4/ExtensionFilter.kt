package chap09.section4

fun main() {

    val list = listOf(1, 2, 3, 4, 5, 6)
    val listMixed = listOf(1, "Hello", 3, "World", 5, 'A')
    val listWithNull = listOf(1, null, 3, null, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // filter: 식에 따라 요소를 골라내기
    println(list.filter { it % 2 == 0 }) // [2, 4, 6] - 짝수만 골라내기
    println(list.filterNot { it % 2 == 0 }) // [1, 3, 5] - 식 이외에 요소
    println(listWithNull.filterNotNull()) // [1, 3, 5, 6] - null을 제외

    // filterIndexed: 인덱스와 함께 추출
    println("filterIndexed: " + list.filterIndexed { idx, value -> idx != 1 && value % 2 == 0 })

    // filterIndexedTo: 추출 후 mutable 컬렉션으로 변환
    val mutList =
            list.filterIndexedTo(mutableListOf()) { idx, value -> idx != 1 && value % 2 == 0 }
    println("filterIndexedTo: $mutList")

    // filterKeys/filterValues: Map의 키/값에 따른 필터
    println("filterKeys: " + map.filterKeys { it != 11 }) // {22=Kotlin, 33=C++}
    println("filterValues: " + map.filterValues { it == "Java" }) // {11=Java}

    // filterIsInstance: 여러 타입의 요소중 원하는 타입을 골라냄
    println("filterIsInstance: " + listMixed.filterIsInstance<String>())

    // slice: 특정 인덱스의 요소들을 잘라서 반환하기
    println("slice: " + list.slice(listOf(0, 1, 2))) // [1, 2, 3]

    // take: n개의 요소를 반환
    println("take: " + list.take(2)) // [1, 2]
    println("takeLast: " + list.takeLast(2)) // [5, 6] - 마지막 요소부터
    println("takeWhile: " + list.takeWhile { it < 3 }) // [1, 2] - 조건식에 따른 반환

    // drop: 처음부터 n개의 요소를 제외한 목록 List 반환
    println("drop: " + list.drop(3)) // [4, 5, 6]
    println("dropWhile: " + list.dropWhile { it < 3 }) // [3, 4, 5, 6]
    println("dropLastWhile: " + list.dropLastWhile { it > 3 }) // [1, 2, 3]

    // componentN: 각 요소를 반환
    println("component1(): " + list.component1()) // 1

    // distinct: 중복 요소는 하나로 취급해 목록 반환
    println("distinct: " + listRepeated.distinct()) // [2, 3, 4, 5, 6]

    // intersect: 교집합 요소만 골라낸다
    println("intersect: " + list.intersect(listOf(5, 6, 7, 8)))
}