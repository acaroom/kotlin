package chap08.section3

fun main() {
    var title = "  Welcome to Kotlin Programming!"

    println(title)
    println(title + "\nChapter1")
    println(title[1])
    println(title.toLowerCase())
    println(title.toUpperCase())
    println(title.trim())

    var deli = "Welcome to Kotlin"
    val sp = deli.split(" ")
    println(sp)
}