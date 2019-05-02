package chap02.section2

fun main() {

    val uint: UInt = 153u
    val ushort: UShort = 65535u
    val ulong: ULong = 46322342uL
    val ubyte: UByte = 255u

    // 확장함수를 사용해 부호없는 자료형과 부호있는 자료형의 변환이 가능
    val int = uint.toInt()
    val byte = ubyte.toByte()
    val ulong2 = byte.toULong()

    // 부호없는 자료형의 연산
    val x = 20u + 22u
    val y = 1u shl 8
    val z = "128".toUByte()
    val range = 1u..5u
}