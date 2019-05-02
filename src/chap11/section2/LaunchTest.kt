package chap11.section2

import kotlinx.coroutines.*

fun main() {
    println("Kotlin Start")
    GlobalScope.launch {  // launch는 코루틴 빌더
        delay(2000)  // 코루틴 안에서만 delay를 사용할 수 있다.
        println("Kotlin Inside")
    }

    println("Kotlin End")
    readLine() // 임의의 키 입력, 결과를 보기위해 main이 종료되지 않게 한다.
}
