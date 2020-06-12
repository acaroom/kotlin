package chap11.section3.extras

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job: Job = Job()
    //val job: Job = SupervisorJob()
    val scope = CoroutineScope(Dispatchers.Default + job)
    val parent = scope.launch {
        val c1 = launch {
            delay(200)
            println("c1")
        }
        val c2 = launch {
            delay(300)
            println("c2")
        }
        val c3 = launch {
            delay(1000)
            println("c3")
        }
        val c4 = launch {
            delay(1200)
            println("c4")
        }
        delay(500)
        c1.cancel()
    }
    parent.join()

}