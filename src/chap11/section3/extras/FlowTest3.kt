package chap11.section3.extras

import kotlinx.coroutines.delay
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.coroutineContext

val flowA = flow {
    println("Emitting coroutine -> $coroutineContext")
    emit("One")
    emit("Two")
    delay(100)
    emit("Three")
}.flowOn(Dispatchers.IO) // The above stream will run in io dispatcher

fun main() = runBlocking {
    flowA.collect {
        println("Collecting coroutine -> $coroutineContext and value $it")
    }
}
