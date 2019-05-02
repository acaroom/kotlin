package chap10.section1

fun main() {

    val calc = Calc()
    var result = 0 // 외부의 변수
    calc.addNum(2,3) { x, y -> result = x + y }  // 클로저
    println(result) // 값을 유지하여 5가 출력

    filteredNames(4)

}

class Calc {
    fun addNum(a: Int, b: Int, add: (Int, Int) -> Unit) { // 람다식 add에는 반환값이 없음
        add(a, b)
    }
}

// 길이가 일치하는 이름만 반환
fun filteredNames(length: Int) {
    val names = arrayListOf("Kim", "Hong", "Go", "Hwang", "Jeon")
    val filterResult = names.filter {
        it.length == length // 바깥의 length에 접근
    }
    println(filterResult)
}

