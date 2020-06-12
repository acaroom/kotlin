package chap11.section2.extras

// Ref. https://medium.com/@elizarov/the-reason-to-avoid-globalscope-835337445abc

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun work(i: Int) {
    Thread.sleep(1000)   // CPU 소비가 크거나 IO 작업같은 것이 올 수 있음 (sleep로 대체)
    println("Work $i done")
}

// (4) withContext : does not block its caller  (1)번과 함께
//suspend fun work(i: Int) = withContext(Dispatchers.Default) {
//    Thread.sleep(1000)
//    println("Work $i done")
//}


fun main() {
    val time = measureTimeMillis {
        val jobs = mutableListOf<Job>() // (3)-2 <-
        // runBlocking 단일스레드 가두기에 의해 빌더가 구성됨
        runBlocking {
            for (i in 1..2) {
                launch {  // (1) 인자가 없으면 디스패처는 runBlocking으로부터 상속됨. 순차적 실행
                //launch(Dispatchers.Default) { // (2) 하위 코루틴을 생성하고 runBlocking은
                                                // 완료가 될 때까지 기다림
                //GlobalScope.launch {// (3)-1
                //jobs += GlobalScope.launch { // (3)-2 GlobalScope는 생명주기를
                                     // 프로그래머가 직접 제어해야 함. join 필요
                    work(i)
                }
            }
            jobs.forEach { it.join() } // (3)-2 <-
        }
    }
    println("Done in $time ms")
}