package chap11.section2.extras.comparescopes

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun work(i: Int) {
    Thread.sleep(1000)
    println("Work $i done")
}

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            for (i in 1..2) {
                //launch {
                launch(Dispatchers.Default) {
                //CoroutineScope(Dispatchers.Default).launch {
                //GlobalScope.launch {
                    work(i)
                }
            }
        }
    }
    println("Done in $time ms")
}
