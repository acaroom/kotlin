package chap07.section2.extras

// 데이터 클래스의 정의
data class Customer(var name: String, var email: String) {
    var job: String = "Unknown"
    constructor(name: String, email: String, _job: String): this(name, email) {
        job = _job
    }
    init {
        // 간단한 로직은 여기에
    }
}

fun main() {

    val cus1 = Customer("Sean", "sean@mail.com")
    val cus2 = Customer("Sean", "sean@mail.com")
    val bob = Customer("Bob", "bob@mail.com")
    val erica = Customer("Erica", "erica@mail.com")

    val customers = listOf(cus1, cus2, bob, erica)

    // 1. equals, hashCode의 사용
    println("1.")
    println(cus1 == cus2) // println(cus1.equals(cus2)) 와 동일
    println("${cus1.hashCode()}, ${cus2.hashCode()}")

    // 2. copy, toString의 사용
    println("2.")
    val cus3 = cus1.copy(name = "Alice") // name 만 변경하고자 할 때
    println(cus1.toString())
    println(cus3.toString())
    println(cus1 == cus3)
    println("${cus1.hashCode()}, ${cus3.hashCode()}")

    // 3. Destructuring의 방법
    println("3.")
    val (name, email) = cus1
    println("name = $name, email = $email")

    // 4. componentsN을 이용하는 방법
    println("4.")
    val name2 = cus1.component1()
    val email2 = cus1.component2()
    println("name = $name2, email = $email2")

    // 5. loop에서 Destructuring의 사용
    println("5.")
    for((name, email) in customers) {
        println("name = $name, email = $email")
    }

    // 6. 함수 반환 객체로 부터 Destructuring
    println("6.")
    val (myName, myEmail) = myFunc()

    // 7. 람다식 함수로 Destructuring 된 변수 출력해 보기
    println("7.")
    val myLamda = {
        (nameLa, emailLa): Customer ->
        println(nameLa)
        println(emailLa)
    }
    myLamda(cus1)
}

fun myFunc(): Customer {
    return Customer("Mickey", "mic@abc.com")
}

