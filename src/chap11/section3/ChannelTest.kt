package chap11.section3

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel


fun main() = runBlocking<Unit> {
    val channel = Channel<Int>()
    // 1. 일반적인 send()와 receive()의 역할
    launch {
        // 여기에 다량의 CPU 연산작업이나 비동기 로직을 둘 수 있다.
        for (x in 1..5) channel.send(x * x)
    }
    // 5개의 값을 채널로부터 받는다
    repeat(5) { println(channel.receive()) }
    println("Done!")

    // 2. close()로 닫고 반복문을 사용해 읽기
    launch {
        for (x in 1..5) channel.send(x * x)
        channel.close() // 모두 보내고 닫기 명시
    }
    // for 루프를 사용해 끝까지 읽기
    for (element in channel) println(element)
    println("Done!")


}
