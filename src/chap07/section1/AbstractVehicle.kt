package chap07.section1

// 추상 클래스, 주 생성자에는 비-추상 프로퍼티 선언의 매개변수 3개가 있다.
abstract class Vehicle(val name: String, val color: String, val weight: Double) {

    // 추상 프로퍼티 (반드시 하위 클래스에서 재정의 해야 한다)
    abstract var maxSpeed: Double

    // 비-추상 프로퍼티 (초기 값인 상태를 저장할 수 있다)
    var year = "2018"

    // 추상 메서드 (반드시 하위 클래스에서 구현 해야 한다)
    abstract fun start()
    abstract fun stop()

    // 비-추상 메서드
    fun displaySpecs() {
        println("Name: $name, Color: $color, Weight: $weight, Year: $year, Max Speed: $maxSpeed")
    }
}

class Car(name: String,
          color: String,
          weight: Double,
          override var maxSpeed: Double) // maxSpeed는 오버라이딩 한다
    : Vehicle(name, color, weight) {

    override fun start() {
        // 코드의 구현
        println("Car Started")
    }

    override fun stop() {
        // 코드의 구현
        println("Car Stopped")
    }
}

class Motorcycle(name: String,
                 color: String,
                 weight: Double,
                 override var maxSpeed: Double)
    : Vehicle(name, color, weight) {

    override fun start() {
        // 코드의 구현
        println("Bike Started")
    }

    override fun stop() {
        // 코드의 구현
        println("Bike Stopped")
    }
}

fun main() {

    val car = Car("SuperMatiz", "yellow", 1110.0, 270.0)
    val motor = Motorcycle("DreamBike", "red", 173.0, 100.0)

    car.year = "2013"

    car.displaySpecs()
    car.start()
    motor.displaySpecs()
    motor.start()
}

