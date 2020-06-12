package extra

import kotlinx.coroutines.*
import kotlin.system.*

fun main() = runBlocking<Unit> {

    val time = measureTimeMillis {
        val one = doSomethingUsefulOne()
        val two = doSomethingUsefulTwo()
//        val one = async { doSomethingUsefulOne() }
//        val two = async { doSomethingUsefulTwo() }
        println("The answer is ${one + two}")
//        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")

}

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L)
    //Thread.sleep(1000L)
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L)
    //Thread.sleep(1000L)
    return 29
}