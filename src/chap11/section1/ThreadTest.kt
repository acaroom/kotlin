package chap11.section1

// Thread클래스를 상속받아 구현하기
class SimpleThread: Thread() {
    override fun run() {
        println("Current Threads: ${Thread.currentThread()}")
    }
}

// Runnable 인터페이스로부터 run() 구현하기
class SimpleRunnable: Runnable {
    override fun run() {
        println("Current Threads(runnable): ${Thread.currentThread()}")
    }
}

fun main() {
    val thread = SimpleThread()
    thread.start()

    val runnable = SimpleRunnable()
    val thread1 = Thread(runnable)
    thread1.start()

    // 익명 객체를 이용한 스레드의 실행
    object : Thread() {
        override fun run() {
            println("Current Threads(object): ${Thread.currentThread()}")
        }
    }.start()

    // 람다식을 이용한 스레드의 생성
    Thread({
        println("Current Threads(lambda): ${Thread.currentThread()}")
    }).start()



}