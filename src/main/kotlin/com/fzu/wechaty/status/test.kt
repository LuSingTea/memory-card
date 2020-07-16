package com.fzu.wechaty.status

import kotlinx.coroutines.*
import java.util.concurrent.ArrayBlockingQueue

fun main() = runBlocking {
    val arrayBlockingQueue = ArrayBlockingQueue<String>(1)
    CoroutineScope(Dispatchers.Default).launch {
        val take = arrayBlockingQueue.take()
        println(1)
        println(take)
    }
    println(2)
    // cancel会取消该任务
//    job.cancel()
//    job.cancelAndJoin()
    arrayBlockingQueue.put("a")
}