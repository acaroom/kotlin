package chap07.section2

import kotlin.reflect.KClass
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

class User(val id: Int, val name: String, var grade: String ="Normal") {
    fun check() {
        if (grade == "Normal") println("You need to get the Silver grade")
    }
}

fun main() {
    // 타입을 출력
    println(User::class)
    // 클래스의 프로퍼티와 메서드의 정보를 출력
    val classInfo = User::class
    classInfo.memberProperties.forEach {
        println("Property name: ${it.name}, type: ${it.returnType}")
    }
    classInfo.memberFunctions.forEach {
        println("Function name: ${it.name}, type: ${it.returnType}")
    }

    // 함수에 전달해 자료형을 알아낸다.
    getKotlinType(User::class) // 클래스 레퍼런스를 위해 ::class 사용, KClass<T>반환
    getJavaType(User::class.java) // 자바의 java.lang.Class를 이용
}

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}

fun getJavaType(obj: Any) {
    println("Class ${obj.javaClass.simpleName}")
    println("Properties\n")
    obj.javaClass.declaredFields.forEach {
        println("${it.name} of ${it.type}")
    }
    println()
    println("Functions\n")
    obj.javaClass.declaredMethods.forEach {
        println(it.name)
    }
}