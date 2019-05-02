package chap11.section4

import kotlin.concurrent.thread

@Volatile private var running = false
private var count = 0

fun start() {
    running = true
    thread(start = true) {
        while (running) println("${Thread.currentThread()}, count: ${count++}")
    }
}

fun stop() { running = false }

fun main() {

    start()
    start()
    Thread.sleep(10)
    stop() // 여기서 상태를 바꾼다
}