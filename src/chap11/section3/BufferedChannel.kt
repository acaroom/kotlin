package chap11.section3

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

fun main() = runBlocking<Unit> {
    val channel = Channel<Int>(3) // 버퍼 capacity 값을 준다
    val sender = launch(coroutineContext) { // 송신자 측
        repeat(10) {
            println("Sending $it")
            channel.send(it) // 지속적으로 보내다가 꽉 차면 일시 지연됨
        }
    }
    // 아무것도 안받고 1초가 잠시 기다린 후
    delay(1000)
    sender.cancel() // 송신자의 작업을 취소 한다.
}
