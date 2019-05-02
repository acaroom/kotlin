package chap11.section2

import kotlinx.coroutines.*

 fun main() = runBlocking {
//suspend fun main() = coroutineScope {
    val jobs = List(100_000) { // 많은 양의 코루틴을 위한 리스트
        launch {
            delay(1000L)
            print(".")
        }
    }
    jobs.forEach { it.join() } // 모든 jobs가 완료될 때가지 기다린다

    // repeat()를 사용해 많은 양의 코루틴을 생성할 수 있다.
    repeat(100_000) {
        launch {
            delay(1000L)
            print("#")
        }
    }

}
