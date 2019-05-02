package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val job = launch {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
    }
    delay(1300L)
    job.cancel()
}
