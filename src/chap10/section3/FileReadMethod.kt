package chap10.section3

import java.io.*
fun main( ) {
    val path = "D:\\test\\Over the Rainbow.txt"

    // 1. 단순 변환
//    val file = File(path)
//    val inputStream: InputStream = file.inputStream( )
//    val inputStreamReader = InputStreamReader(inputStream)
//    val sb = StringBuilder( )
//    var line: String?
//    val br = BufferedReader(inputStreamReader)
//    try {
//        line = br.readLine( )
//        while (line != null) {
//            sb.append(line, '\n')
//            line = br.readLine( )
//        }
//        println(sb)
//    } catch (e:Exception) {
//    } finally {
//        br.close( )
//    }

    // 2. 코틀린 스타일
    val file = File(path)
    val inputStream: InputStream = file.inputStream( )
    val text = inputStream.bufferedReader( ).use { it.readText( ) }
    println(text)

}

