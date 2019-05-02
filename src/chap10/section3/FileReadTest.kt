package chap10.section3

import java.io.*

fun main() {
    val path = "D:\\test\\Over the Rainbow.txt"

    // 1. FileReader의 이용
//    try {
//        val read = FileReader(path)
//        println(read.readText())
//    } catch (e: Exception) {
//        println(e.message)
//    }


    // 2. 단순 변환
/*
    val file = File(path)
    val inputStream: InputStream = file.inputStream()
    val inputStreamReader = InputStreamReader(inputStream)
    val sb = StringBuilder()
    var line: String?
    val br = BufferedReader(inputStreamReader)
    try {
        line = br.readLine()
        while (line != null) {
            sb.append(line, '\n')
            line = br.readLine()
        }
        println(sb)
    } catch (e:Exception){

    } finally {
        br.close()
    }
*/

    // 3. use를 사용한 축소
//    val file = File(path)
//    val inputStream: InputStream = file.inputStream()
//    val text = inputStream.bufferedReader().use { it.readText() }
//    println(text)

    // 4. BufferedReader 만 사용해서 읽기
//    val bufferedReader: BufferedReader = File(path).bufferedReader()
//    val inputString = bufferedReader.use { it.readText() }
//    println(inputString)

    // 5. useLines의 이용용
//    val bufferedReader = File(path).bufferedReader()
//    val lineList = mutableListOf<String>()
//    bufferedReader.useLines { lines -> lines.forEach { lineList.add(it) } }
//    lineList.forEach { println(">  " + it) }

    // 6. BufferedReader의 생략
    val lineList = mutableListOf<String>()
    File(path).useLines { lines -> lines.forEach { lineList.add(it) } }
    lineList.forEach { println(">  " + it) }

}
