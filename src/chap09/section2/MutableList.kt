package chap09.section2

fun main() {
    // 가변형 List의 생성 및 추가, 삭제, 변경
    val mutableList: MutableList<String> = mutableListOf<String>("Kildong", "Dooly", "Chelsu")
    mutableList.add("Ben") // 추가
    mutableList.removeAt(1) // 인덱스 1 삭제
    mutableList[0] = "Sean" // 인덱스 0를 변경, set(index: Int, element: E)과 같은 역할
    println(mutableList)

    // 자료형의 혼합
    val mutableMixed = mutableListOf("Android", "Apple", 5, 6, 'X')
    println(mutableMixed)
}