package chap11.section3.extras.withc

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

suspend fun main() {
    val scope = CoroutineScope(Dispatchers.Default) // 코루틴 스코프 (Defaut 디스패처)

    scope.launch {
    //GlobalScope.launch {
        // 여기는 위의 Default가 상속되 실행되는 스레드 입니다.
        println("(1) launch ${Thread.currentThread().name} $coroutineContext")

        withContext(Dispatchers.IO) { // 이렇게 하면 IO를 위한 스레드풀이 사용되면서 달라지죠
            // 그래서 여기에 각종 IO 블로킹 동작을 처리하고..
            println("(2) withContext...IO ${Thread.currentThread().name} $coroutineContext")
        }

        // 여기는 위에 Default 영역이죠!
        println("(3) launch ${Thread.currentThread().name} $coroutineContext")

        withContext(Dispatchers.Unconfined) {
            // 요놈은 특이하게 현재(콜러 그러므로 Default) 스레드에서 그냥 바로 실행됩니다.
            println("(4) withContext..Unconfined ${Thread.currentThread().name} $coroutineContext")
            // 그러다가 suspend 계열 함수를 만나면 예를 들어 delay(...)
            delay(100)
            // 그러면 여기서부터 또다른 스레드로 실행문맥이 바뀌죠.
            println("(5) withContext..Unconfined ${Thread.currentThread().name} $coroutineContext")
        }

        withContext(Dispatchers.IO) {
            // 또 사용하면 계속 IO를 위한 스레드풀에서 스레드가 사용될 겁니다.
            println("(6) withContext..IO ${Thread.currentThread().name} $coroutineContext")
        }

        withContext(Dispatchers.IO) {
            // 또 사용하면 계속 IO를 위한 스레드풀에서 스레드가 사용될 겁니다.
            println("(7) withContext..IO ${Thread.currentThread().name} $coroutineContext")
        }
    }
    delay(500)
}