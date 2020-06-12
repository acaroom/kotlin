package chap11.section3.extras

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

fun myFlow() = flow {  // (1) flow 빌더의 생성
    emit("One") // (2) 값의 방출
    emit("Two")
    delay(100)  // (3)  flow에서 제공되므로 myFlow함수에 suspend가 필요없다.
    emit("Three")
}

fun main() = runBlocking<Unit> {
    myFlow().collect {
        // (4) 값의 수집 - callect가 사용되기 전에는 flow {...} 블록이 실행되지 않는다
        println(it)
    }
}
