package chap04.section3

fun main() {

    var amount = 600

    try {
        amount -= 100
        checkAmount(amount)
    } catch (e : Exception){
        println(e.message)
    }
    println("amount: $amount")
}

fun checkAmount(amount : Int){
    if (amount < 1000) {
        throw Exception("잔고가 $amount 으로 1000 이하 입니다.")
    }
}