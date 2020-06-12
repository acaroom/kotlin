fun <T> add(a: T, b: T, op: (T, T) -> T): T {
    return op(a, b)
}
fun main() {
    val result = add(2, 3, {a, b -> a + b})
    // val result = add(2, 3) {a, b -> a + b}와 같이 표현 가능
    println(result)

    val arg1 = 6
    val arg2 = 3
    printProduct(arg1, arg2)
}

fun printProduct(arg1: Int, arg2: Int) {
    println(arg1 + arg2)
}