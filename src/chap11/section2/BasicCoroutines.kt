package chap11.section2

import kotlinx.coroutines.*

fun main() {  // 메인 스레드
    GlobalScope.launch { // 새로운 코루틴을 백그라운드에 실행
        delay(1000L) // 1초의 넌블로킹 지연 (시간의 기본단위는 ms)
        println("World!") // 지연 후 출력
        doSomething()
    }
    println("Hello,") // main 스레드가 코루틴이 지연되는 동안 계속 실행된다.
    Thread.sleep(2000L) // main스레드가 JVM에서 바로 종료되지 않게 2초 기다린다.
}

suspend fun doSomething() {
    println("Do something!")
}