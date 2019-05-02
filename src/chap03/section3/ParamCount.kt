package chap03.section3

fun main() {
    // 1. 매개변수 없는 람다식 함수
    noParam({ "Hello World!" })
    noParam { "Hello World!" } // 위와 동일 결과, 소괄호 생략 가능

    // 2. 매개변수가 하나 있는 람다식 함수
    oneParam({ a -> "Hello World! $a" })
    oneParam { a -> "Hello World! $a" } // 위와 동일 결과, 소괄호 생략 가능
    oneParam { "Hello World! $it" }  // 위와 동일 결과, it으로 대체 가능

    // 3. 매개변수가 두개 있는 람다식 함수
    moreParam { a, b -> "Hello World! $a $b" } // 매개변수명 생략 불가

    // 4. 인자와 함께 사용하는 경우
    withArgs("Arg1", "Arg2", { a, b -> "Hello World! $a $b" })
    // withArgs()의 마지막 인자가 람다식인 경우 소괄호 바깥으로 분리 가능
    withArgs("Arg1", "Arg2") { a, b -> "Hello World! $a $b" }

    // 5. 특정 매개변수의 생략
    omitArgs("Arg1", "Arg2") { _, b -> "Hello World! $b" }

}

// 매개변수가 없는 람다식 함수가 noParam 함수의 매개변수로 지정됨
fun noParam(out: () -> String) = println(out())

// 매개변수가 하나 있는 람다식 함수가 oneParam함수의 매개변수로 지정됨
fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

// 매개변수가 두개 있는 람다식 함수가 moreParam함수의 매개변수로 지정됨
fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}

// withArgs함수는 일반 매개변수 2개를 포함, 람다식함수를 마지막 매개변수로 가짐
fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}

// 특정 매개변수의 생략
fun omitArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}
