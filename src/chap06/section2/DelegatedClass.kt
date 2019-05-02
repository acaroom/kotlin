package chap06.section2

interface Car {
    fun go(): String
}

class VanImpl(val power: String): Car {
    override fun go() = "는 짐을 적재하며 $power 마력을 가집니다."
}

class SportImpl(val power: String): Car {
    override fun go() = "는 경주용에 사용되며 $power 마력을 가집니다."
}

class CarModel(val model: String, impl: Car): Car by impl {
    fun carInfo() {
        println("$model ${go()}") // 참조 없이 각 인터페이스 구현 클래스의 go를 접근
    }
}

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100마력"))
    val my350z = CarModel("350Z 2008", SportImpl("350마력"))

    myDamas.carInfo()
    my350z.carInfo()
}
