package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val jobs = arrayListOf<Job>()
    jobs += launch(Dispatchers.Unconfined) { // main 스레드에서 작업
        println("Unconfined:\t\t ${Thread.currentThread().name}")
    }
    jobs += launch(coroutineContext) { // 부모의 문맥, 여기서는 runBlocking의 문맥
        println("coroutineContext:\t ${Thread.currentThread().name}")
    }
    jobs += launch(Dispatchers.Default) { // 디스패처의 기본값
        println("Default:\t\t ${Thread.currentThread().name}")
    }
    jobs += launch(Dispatchers.IO) { // 입출력 중심의 문맥
        println("IO:\t\t ${Thread.currentThread().name}")
    }
    jobs += launch { // 아무런 인자가 없을 때
        println("main runBlocking: ${Thread.currentThread().name}")
    }
    jobs += launch(newSingleThreadContext("MyThread")) { // 새 스레드를 생성함
        println("MyThread:\t\t ${Thread.currentThread().name}")
    }
    jobs.forEach { it.join() }
}

