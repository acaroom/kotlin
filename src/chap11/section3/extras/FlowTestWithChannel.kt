package chap11.section3.extras.flowchannel

import kotlin.system.*
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*
import kotlinx.coroutines.flow.*

val ints: Flow<Int> = flow {
    for (i in 1..10) {
        delay(100)
        emit(i)
    }
}

fun <T> Flow<T>.buffer(size: Int = 0): Flow<T> = flow {
    coroutineScope {
        val channel = produce(capacity = size) {
            collect { send(it) }
        }
        channel.consumeEach { emit(it) }
    }
}

suspend fun main() {
    val time = measureTimeMillis {
        ints.buffer().collect {
            delay(100)
            println(it)
        }
    }
    println("Collected in $time ms")
}