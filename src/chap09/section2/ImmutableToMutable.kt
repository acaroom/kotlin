package chap09.section2

fun main() {

    // 불변형 List를 가변형으로 변환하기
    val names: List<String> = listOf("one", "two", "three") // 불변형 List

    val mutableNames = names.toMutableList()  // 새로운 가변형 List 가 만들어짐
    mutableNames.add("four")
    println(mutableNames)
}