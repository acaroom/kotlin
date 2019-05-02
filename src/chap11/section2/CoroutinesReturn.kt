package chap11.section2

import kotlinx.coroutines.*

fun main() {
    val job = GlobalScope.launch { // Job 객체의 반환
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    println("job.isActive: ${job.isActive}, completed: ${job.isCompleted}")
    Thread.sleep(2000L)
    println("job.isActive: ${job.isActive}, completed: ${job.isCompleted}")
}
