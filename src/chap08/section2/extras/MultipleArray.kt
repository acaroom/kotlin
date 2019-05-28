package chap08.section2.extras

fun main() {

    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(4, 5, 6)
    val array3 = arrayOf(7, 8, 9)

    val arr2d = arrayOf(array1, array2, array3)

    // 또는 다음과 같이 초기화 할 수 있음
    //val arr2d_v2 = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))

    for (e1 in arr2d) {
        for (e2 in e1) {
            print(e2)
        }
        println()
    }

    println(arr2d[2][1])
}
