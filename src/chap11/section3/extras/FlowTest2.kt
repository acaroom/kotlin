package chap11.section3.extras

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun foo(): Flow<Int> = flow { // flow 빌더 - foo함수의 suspend 키워드 없이 지연 제공
    for (i in 1..3) {
        delay(100) // 무언가 CPU를 소비한다고 가정
        emit(i) // 지속적으로 다음 값을 방출
    }
}

fun main() = runBlocking<Unit> {
    launch { // 메인스레드와 함께 병행적으로 처리되는지 확인하기 위한 용도
        for (k in 1..3) {
            println("I'm not blocked $k")
            delay(100)
        }
    }
    // flow에서 값 수집하기
    foo().collect { value -> println(value) }
}
