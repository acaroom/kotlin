package chap08.section1

class Box<T>(t: T) {  // 제네릭을 사용해 형식 매개변수를 받아 name에 저장
    var name = t
}
fun main() {
    val box1: Box<Int> = Box<Int>(1)
    val box2: Box<String> = Box<String>("Hello")

    println(box1.name)
    println(box2.name)
}
