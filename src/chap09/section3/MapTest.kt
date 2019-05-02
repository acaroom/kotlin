package chap09.section3

import java.util.*

fun main() {

    // 불변형 Map
    val langMap: Map<Int, String> = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")
    for ((key, value) in langMap) {
        println("key=$key, value=$value")
    }
    println("langMap[22] = ${langMap[22]}")
    println("langMap.get(22) = ${langMap.get(22)}")
    println("langMap.keys = ${langMap.keys}")
    println()

    // 가변형 Map
    val capitalCityMap: MutableMap<String, String> = mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japan" to "Tokyo")
    println(capitalCityMap.values)
    println(capitalCityMap.keys)
    capitalCityMap.put("UK", "London")
    capitalCityMap.remove("China")
    println(capitalCityMap)

    // putAll()을 사용한 맵의 추가
    val addData = mutableMapOf("USA" to "Washington")
    capitalCityMap.putAll(addData)
    println(capitalCityMap)

    // java.util.HashMap의 사용
    val hashMap: HashMap<Int, String> = hashMapOf(1 to "Hello", 2 to "World")
    println("hashMap = $hashMap")

    // java.util.SortedMap 사용
    val sortedMap: SortedMap<Int, String> = sortedMapOf(1 to "Apple", 2 to "Banana")
    println("sortedMap = $sortedMap")

    // java.util.LinkedHashMap의 사용
    val linkedHash: LinkedHashMap<Int, String> = linkedMapOf(1 to "Computer", 2 to "Mouse")
    println("linkedHash = $linkedHash")
}



