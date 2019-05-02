package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val listMixed = listOf(1, "Hello", 3, "World", 5, 'A')
    val listWithNull = listOf(1, null, 3, null, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // forEach: 각 요소를 람다식으로 처리
    list.forEach { print("$it ") }
    println()
    list.forEachIndexed { index, value -> println("index[$index]: $value") }

    // onEach: 각 요소를 람다식으로 처리 후 컬렉션으로 반환
    val returnedList = list.onEach { print(it) }
    println()
    val returnedMap = map.onEach { println("key: ${it.key}, value: ${it.value}") }
    println("returnedList = $returnedList")
    println("returnedMap = $returnedMap")

    // count: 조건에 맞는 요소 갯수 반환
    println(list.count { it % 2 == 0 }) // 3

    // max: 가장 높은/낮은 요소의 반환
    println(list.max()) // 6
    println(list.min()) // 1

    // maxBy/minBy: 최대/최솟값으로 나온 요소 it에 대한 식의 결과
    println("maxBy: " + map.maxBy { it.key }) // 키를 기준으로 최댓값
    println("minBy: " + map.minBy { it.key }) // 키를 기준으로 최솟값

    // fold: 초기값과 정해진 식에 따라 처음요소부터 끝 요소에 적용하며 값을 생성
    println(list.fold(4) { total, next -> total + next }) // 4+ 1 + ... 6 = 25
    println(list.fold(1) { total, next -> total * next }) // 1 * 1 * 2 *... 6 = 720
    // foldRight: fold와 같고 마지막 요소에서 처음요소로 반대로 적용
    println(list.foldRight(4) { total, next -> total + next })
    println(list.foldRight(1) { total, next -> total * next })

    // reduce: fold와 동일하지만 초기값을 사용하지 않음
    println(list.reduce { total, next -> total + next })
    println(list.reduceRight { total, next -> total + next })

    // sumBy: 식에 의해 도출된 모든 요소를 합함
    println(listPair.sumBy { it.second })
}