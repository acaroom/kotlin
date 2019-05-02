package chap11.section4

import kotlinx.coroutines.runBlocking

private const val PRINT_STR_ITEM = 1
private const val EXIT_ITEM = 2

fun main() = runBlocking {
    var evtLoopRunning = true

    while (evtLoopRunning) {
        println("-- Menu --")
        println("1. Print String")
        println("2. Exit")
        print("\nEnter number: ")
        evtLoopRunning = handleMenuInput()
    }
}

private fun printString() {
    var str = ""

    while (str.isEmpty()) {
        print("\nEnter String to print: ")
        str = readLine() ?: ""
        if (str.isNotEmpty()) println("You entered the following String: $str")
    }
}

private fun handleMenuInput() = when (readLine()) {
    PRINT_STR_ITEM.toString() -> {
        printString()
        true
    }
    EXIT_ITEM.toString() -> false
    else -> true
}