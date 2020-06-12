package chap11.section4.extras

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.actor
import kotlinx.coroutines.runBlocking

sealed class Message {
    class Increment(val value: Int) : Message()
    class GetValue(val deferred: CompletableDeferred<Int>) : Message()
}

fun CoroutineScope.basicActor() = actor<Message> {
    var counter = 0

    for (message in channel) {
        when(message) {
            is Message.Increment -> counter += message.value
            is Message.GetValue -> message.deferred.complete(counter)
        }
    }
}

fun main() = runBlocking<Unit> {
    val channel = basicActor()

    channel.send(Message.Increment(1))
    channel.send(Message.Increment(2))

    val deferred = CompletableDeferred<Int>()

    channel.send(Message.GetValue(deferred))

    println(deferred.await()) // prints "3"

    channel.close()
}
