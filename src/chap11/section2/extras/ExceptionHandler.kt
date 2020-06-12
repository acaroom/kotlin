package chap11.section2.extras

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    // propagating exception to the default Thread.UncaughtExceptionHandler
    val job = GlobalScope.launch {
        throw AssertionError()
    }

    // blocks thread execution until coroutine completes
    job.join()

    // launches async coroutine but exception is not propagated until await is called
    val deferred = GlobalScope.async(Dispatchers.Default) {
        throw AssertionError()
    }

    //defines a specific handler
    val handler = CoroutineExceptionHandler { _, exception ->
        println("We caught $exception")
    }

    // propagating exception using a custom CoroutineExceptionHandler
    GlobalScope.launch(handler) {
        throw AssertionError()
    }

    // This exception is finally propagated calling await and should be handled by user eg. with try {} catch {}
    deferred.await()
}