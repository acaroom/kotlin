package chap05.section6

//  여럿의 오리를 위한 List 매개변수
class Pond(_name: String, _members: MutableList<Duck>) {
    val name: String = _name
    val members: MutableList<Duck> = _members
    constructor(_name: String): this(_name, mutableListOf<Duck>())
}

class Duck(val name: String)

fun main() {

    // 두 개체는 서로 생명주기에 영향을 주지 않는다.
    val pond = Pond("myFavorite")
    val duck1 = Duck("Duck1")
    val duck2 = Duck("Duck2")

    // 연못에 오리를 추가 - 연못에 오리가 집합한다
    pond.members.add(duck1)
    pond.members.add(duck2)


    // 연못에 있는 오리들
    for (duck in pond.members) {
        println(duck.name)
    }
}