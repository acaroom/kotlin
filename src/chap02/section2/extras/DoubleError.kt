package chap02.section2.extras

fun main() {

    var num: Double = 0.1

    for(x in 0..999) {
        num += 0.1
    }
    println(num) // 100.09999999999859
}