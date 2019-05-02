package chap10.section1

fun main() {

    val score: Int? = 32
//    var score = null

    // 일반적인 null 검사
    fun checkScore() {
        if (score != null) {
            println("Score: $score")
        }
    }

    // let을 사용해 null 검사를 제거함
    fun checkScoreLet() {
        score?.let { println("Score: $it") } // (1)
        val str = score.let { it.toString() } // (2)
        println(str)
    }

    checkScore()
    checkScoreLet()


    // 체이닝
    var a = 1
    var b = 2

    a = a.let { it + 2 }.let {
        val i = it + b
        i  // 마지막 식이 반환 된다
    }
    println(a) //5

}