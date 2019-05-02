package chap04.section3

fun main() {
    val a = 6
    val b = 0
    val c : Int

    try {
        c = a / b  // 예외가 발생할 수 있는 코드
     // (1) 기본 사용
//    } catch (e : Exception){
//        println("Exception is handled.")
//    }

     // (2) 특정 예외 처리
//    } catch (e : ArithmeticException){
//        println("Exception is handled. ${e.message}")
//    }

    // (3) 스택 추적
    } catch (e : Exception){
        e.printStackTrace()
    }

    // (3) 메시지 출력
//    } catch (e : Exception){
//        println(e.message)
//    }

    finally {
        println("finally 블록은 반드시 항상 실행됨")
    }

}