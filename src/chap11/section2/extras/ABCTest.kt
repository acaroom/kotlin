package chap11.section2.extras

import kotlinx.coroutines.*

fun log(s: CoroutineScope, msg: String) = println("${s.coroutineContext}|[${Thread.currentThread().name}]|$msg")

fun main() = runBlocking {
    //runBlocking {
    //coroutineScope {
        log(this, "Start")
        launch {// 실행됨
        //GlobalScope.launch { // 실행되지 않음
        //launch(Dispatchers.Default) { // 실행됨
        //CoroutineScope(Dispatchers.Default).launch {  // 실행되지 않음
            log(this, "A before delay")
            delay(1000L)
            //println(this)
            log(this, "A after delay")
        }

        withContext(Dispatchers.IO) {
            log(this, "IO before delay")
            delay(500L)
            log(this, "IO after delay")
        }
        log(this, "C")

    withContext(Dispatchers.Unconfined) {
        log(this, "Unconfined")
        delay(500L)
        log(this, "Unconfined")
    }
    log(this, "END")

    delay(2000)
}