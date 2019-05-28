package chap11.section2.asynctest

import kotlinx.coroutines.*
import java.util.concurrent.Executors


suspend fun doWork1(): String {
    delay(1000)
    return "Work1"
}

suspend fun doWork2(): String {
    delay(3000)
    return "Work2"
}

private fun worksInSerial() {
    // 순차적 실행
    GlobalScope.launch {
        val one = doWork1()
        val two = doWork2()
        println("Kotlin One : $one")
        println("Kotlin Two : $two")
    }
}


private fun worksInParallel() {
    // 컨텍스트에서 사용할 스레드 수를 정할 수 있다.
    val threadPool = Executors.newFixedThreadPool(4)
    val MyContext = threadPool.asCoroutineDispatcher()

    // Deferred<T> 를 통해 결과값을 반환한다.
    val one = GlobalScope.async(MyContext) {
        doWork1()
    }
    val two = GlobalScope.async {
        doWork2()
    }

    GlobalScope.launch {
        val combined = one.await() + "_" + two.await()
        println("Kotlin Combined : $combined")
    }
}

fun main() {
    worksInSerial()
    worksInParallel()
    readLine()
}