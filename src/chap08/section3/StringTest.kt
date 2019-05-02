package chap08.section3

fun main() {

    val hello: String = "Hello World!"
    println(hello[0])

    // hello[0] = 'K' 는 허용 불가

    // 문자열 추출
    println(hello.substring(0..2))
    println(hello.subSequence(0..2))

    // 문자열의 비교
    var s1 = "Hello Kotlin"
    var s2 = "Hello KOTLIN"
    // 같으면 0, s1<s2 이면 양수, 반대면 음수를 반환
    println(s1.compareTo((s2)))
    println(s1.compareTo(s2, true)) // 대소문자 무시

    // 자바의 StringBuilder 사용
    var s = StringBuilder("Hello")
    s[2] = 'x'  // 허용되지 않았던 요소의 변경이 가능하다.
    println(s)

    s.append("World")
    println(s)

    s.insert(10,"Added")
    println(s)

    s.delete(5,10)
    println(s)

}