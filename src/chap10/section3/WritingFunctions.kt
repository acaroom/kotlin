package chap10.section3

import java.io.FileWriter

fun main() {

    val outString: String = "안녕하세요!\tHello\r\nWorld!."
    val path = "D:\\test\\testfile.txt"

    // 1. 기본 사용 방법
//    val file = File(path)
//    val printWriter = PrintWriter(file)
//
//    printWriter.println(outString)
//    printWriter.write(outString)
//    printWriter.flush()
//    printWriter.close()

    // 2. use를 이용한 자동 닫기
//    File(path).printWriter().use { out -> out.println(outString) }
//    File(path).printWriter().use { it.println(outString) }

    // 3. BufferedWriter의 이용
//    File(path).bufferedWriter().use { it.write(outString) }

    // 4. writeText의 이용
//    val file= File(path)
//    file.writeText(outString)
//    file.appendText("\nDo great work!")

    // 5. FileWriter를 사용한 기록 - 기본
//    val writer = FileWriter(path, true) // 인자: 경로, append여부
//    try {
//        writer.write(outString)
//    } catch (e: Exception) {
//
//    } finally {
//        writer.close()
//    }

    // 5. FileWriter를 사용한 기록 - 축소
    FileWriter(path, true).use { it.write(outString) }

}