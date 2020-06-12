package chap11.section2.extras

import kotlinx.coroutines.*

//suspend fun main() {
fun main() = runBlocking {
    var resultOne = "Hardstyle"
    var resultTwo = "Minions"
    println("withContext - Before")
//    resultOne = withContext(Dispatchers.IO) { function1() } // wait for the result
//    resultTwo = withContext(Dispatchers.IO) { function2() }

//     launch(Dispatchers.IO) { resultOne = function1() } // don't wait
//     launch(Dispatchers.IO) { resultTwo = function2() }

    val defOne = async(Dispatchers.IO) { function1() } //
    val defTwo = async(Dispatchers.IO) { function2() } // shortest first!


    println("withContext- After")
    //val resultText = resultOne + resultTwo
    val resultText = defOne.await() + defTwo.await()
    println("withContext: $resultText")
}
suspend fun function1(): String {
    delay(1000L)
    val message = "function1"
    println("withContext: $message")
    return message
}
suspend fun function2(): String {
    delay(100L)
    val message = "function2"
    println("withContext: $message")
    return message
}