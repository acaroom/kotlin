package chap11.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*
import kotlin.system.*

suspend fun CoroutineScope.massiveRun(action: suspend () -> Unit) {
    val n = 100
    val k = 1000
    val time = measureTimeMillis {
        val jobs = List(n) {
            launch {
                repeat(k) { action() }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${n * k} actions in $time ms")
}

// counterActor를 위한 메시지
sealed class CounterMsg
object IncCounter : CounterMsg() // counter를 증가하기 위한 단방향 메시지
class GetCounter(val response: CompletableDeferred<Int>) : CounterMsg() // 응답 요청

// // 새로운 counter actor를 위한 함수
fun CoroutineScope.counterActor() = actor<CounterMsg> {
    var counter = 0 // 카운터
    for (msg in channel) { // 들어오는 메시지에 대한 처리 반복문
        when (msg) {
            is IncCounter -> counter++
            is GetCounter -> msg.response.complete(counter)
        }
    }
}

fun main() = runBlocking<Unit> {
    val counter = counterActor() // actor의 생성
    GlobalScope.massiveRun {
        counter.send(IncCounter)
    }
    // actor의 카운터값을 얻기 위해 요쳥
    val response = CompletableDeferred<Int>()
    counter.send(GetCounter(response))
    println("Counter = ${response.await()}")
    counter.close() // actor의 중단
}