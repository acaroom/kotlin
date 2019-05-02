fun <T> add(a: T, b: T, op: (T, T) -> T): T {
    return op(a, b)
}
fun main() {
    val result = add(2, 3, {a, b -> a + b})
    // val result = add(2, 3) {a, b -> a + b}와 같이 표현 가능
    println(result)
}

