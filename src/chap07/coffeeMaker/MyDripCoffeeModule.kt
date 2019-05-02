package chap07.coffeeMaker

class MyDripCoffeeModule : CoffeeModule {
    companion object {
        val electricHeater: ElectricHeater by lazy { // lazy를 이용한 지연 초기화 기법 사용
            ElectricHeater()
        }
    }

    private val _thermosiphon : Thermosiphon by lazy {
        Thermosiphon(electricHeater)
    }

    override fun getThermosiphon() : Thermosiphon = _thermosiphon
}
