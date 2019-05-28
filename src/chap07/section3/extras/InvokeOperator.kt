package chap07.section3.extras

class Manager {
    operator fun invoke(value: String) {
        println(value)
    }
}

fun main() {
    val manager = Manager()

    // 원래는 manager.invoke("...")형태로 호출되며 invoke가 생략되었다.
    manager("Do something for me!")

    // 람다식 함수에는 invoke가 기본 정의된다.
    val sum = { x: Int, y: Int -> x + y }
    sum.invoke(3, 10)
    sum(3, 10) // 위와 동일한 결과

}


