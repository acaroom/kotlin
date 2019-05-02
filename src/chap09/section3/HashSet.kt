package chap09.section3

fun main() {
    // 자바의 java.util.HashSet 선언
    val intsHashSet: HashSet<Int> = hashSetOf(6, 3, 4, 7)
    intsHashSet.add(5)
    intsHashSet.remove(6)
    println(intsHashSet)
}