package chap11.section3.extras

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val startTime = System.currentTimeMillis()
    val job = GlobalScope.launch {
        var nextPrintTime = startTime
        var i = 0
        while (i < 5) { // 조건을 계산에 의해 반복
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("I'm sleeping ${i++} ...")
                nextPrintTime += 500L
            }
        }
    }
    delay(1300L)
    println("main: I'm tired of waiting!")
    job.cancelAndJoin()
    println("main: Now I can quit.")
}
