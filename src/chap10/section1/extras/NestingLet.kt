package chap10.section1.extras

fun main() {
    var x = "Kotlin!"
    x.let { outer ->
        outer.let { inner ->
            print("Inner is $inner and outer is $outer")
        }
    }
}