package chap11.section2

import kotlinx.coroutines.*

//fun main() = runBlocking<Unit> { // Option 1. 메인 메서드가 코루틴 환경에서 실행
suspend fun main() = coroutineScope { // Option 2. 코틀린 1.3 부터는 main()에 suspend 지정 가능
    val job = launch { // 백그라운드로 코루틴 실행
        delay(1000L)
        println("World!")
    }
    println("Hello") // 즉시 이어서 실행됨
    //delay(2000L)     // delay()를 사용하지 않아도 코루틴을 기다림
    job.join()  // 명시적으로 코루틴이 완료되길 기다린다. 취소할 경우 job.cancel()을 사용한다.
}
