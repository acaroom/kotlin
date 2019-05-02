package chap11.section2

import kotlinx.coroutines.*

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
    // Deferred<T> 를 통해 결과값을 반환
    val one = GlobalScope.async {
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
