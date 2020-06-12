package chap11.section3.extras

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val job = launch {
        try {
            repeat(1000) { i ->
                println("I'm sleeping $i ...")
                delay(500L)
            }
        } finally {
            println("Bye!")
            delay(100)
            println("another")
            // finally의 완전한 실행을 보장함
//            withContext(NonCancellable) {
//                println("I'm running finally")
//                delay(1000L)
//                println("Non-cancellable") // 1 초를 지연해도 취소되지 않는다.
//            }

        }
    }
    delay(1300L)
    job.cancelAndJoin() // 작업을 취소하고 완료될 때까지 기다림
    //job.cancel()
    println("main: Quit!")
}
