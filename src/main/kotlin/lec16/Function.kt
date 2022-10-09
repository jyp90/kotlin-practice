package lec16

import com.lannstark.lec16.Person
import java.lang.IllegalArgumentException

fun main() {
    val str = "ABC"

    println(str.lastChar())

    var i = 1
    i.add2(1)
}

// 확장함수
fun String.lastChar(): Char { // 자바에서 FunctionKt.lastChar("ABC")
    return this[this.length - 1]
}


// fun 확장하려는클래스.함수이름(파라미터): 리턴타입 {
// this 를 이용해 실제 클래스 안에 접근
// }

fun Person.nextYearAge(): Int {
    println("Extension Function")
    return this.age + 1
}


// infix 함수 : 함수 호출 방식을 바꿔줌
fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}


// inline 함수 : 함수를 파라미터로 전달할 때에 오버헤드를 줄임


// local function(지역 함수) : 함수 안에 함수를 선언
fun createPerson(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName: String) {
        return if(name == null) {
            throw IllegalArgumentException("$fieldName is null")
        } else {

        }
    }

    return Person(firstName, lastName,  1)
}