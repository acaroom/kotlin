package chap03.section4

import java.util.concurrent.locks.ReentrantLock

var sharable = 1 // 보호가 필요한 공유자원

fun main() {
    val reLock = ReentrantLock()

    // (1), (2), (3) 표현식이 모두 동일
    lock(reLock, { criticalFunc() }) // (1)
    lock(reLock) { criticalFunc() }  // (2)
    lock(reLock, ::criticalFunc)     // (3)

    println(sharable)
}

fun criticalFunc() {
    // 공유자원 접근 코드 사용 (thread safe code)
    sharable += 1
}

fun <T> lock(reLock: ReentrantLock,  body: ()->T): T {
    reLock.lock()
    try {
        return body()
    } finally {
        reLock.unlock()
    }
}
