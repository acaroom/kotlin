package chap09.section2


fun main() {

    var numbers: List<Int> = listOf(1, 2, 3, 4, 5, 1)
    var names: List<String> = listOf("one", "two", "three")
    for (name in names) {
        println(name)
    }
    for (num in numbers) print(num) // 한 줄에서 처리하기
    println() // 내용일 없을 때는 한 줄 내리는 개행

    // List의 기본 멤버 메서드
    println(names.size) // 3
    println(names.get(0)) // "one"
    println(names.indexOf("three")) // 2
    println(names.contains("two")) //  true

    // 여러가지 타입이 병합된 선언
    var mixedTypes = listOf("Hello", 1, 2.445, 's')

    // 비어있는 리스트 생성
    val emptyList = emptyList<String>()

    // null이 아닌 요소만 골라 컬렉션을 반환
    val nonNullsList: List<Int> = listOfNotNull(2, 45, 2, null, 5, null)
    println(nonNullsList)

    // 가변형 List를 생성하고 자바의 ArrayList로 반환
    val stringList: ArrayList<String> = arrayListOf<String>("Hello", "Kotlin", "Wow")
    stringList.add("Java")
    println(stringList)

    // 가변형 List의 생성 및 추가, 삭제, 변경
    val mutableListNames: MutableList<String> = mutableListOf<String>("Kildong", "Dooly", "Chelsu")
    mutableListNames.add("Ben") // 추가
    mutableListNames.removeAt(1) // 인덱스 1 삭제
    mutableListNames[0] = "Sean" // 인덱스 0를 변경

    // 타입의 혼합
    val mutableListMixed = mutableListOf("Android", "Apple", 5, 6, 'X')


    // 불변형 List를 가변형으로 변경후 새로운 할당
    val newNames = names.toMutableList()
    newNames.add("Kildong")
    println(newNames)

}


