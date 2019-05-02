package chap10.section1

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {

    PrintWriter(FileOutputStream("d:\\test\\output.txt")).use {
        it.println("hello")
    }

    val file = File("d:\\test\\contents.txt")
    file.bufferedReader().use {
        println(it.readText())
    }

}