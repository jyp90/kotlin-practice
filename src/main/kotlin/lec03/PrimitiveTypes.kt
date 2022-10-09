package lec03

import com.lannstark.lec03.Person

class PrimitiveTypes {
}

fun main() {
    var inttype = 4;  // Int
    var longtype = 4L; // Long

    var number1: Int = 4
    var number2: Long = number1.toLong()
    var result = number1 / number2

    var intnum1: Int? = 3
    var longnum1: Long = intnum1!!.toLong()

    printAgeIfPerson(Person("", 1100))
}

fun printAgeIfPerson(obj: Any) {
    if(obj is Person) {
        val person = obj // == obj as Person
        println(person.age) // == println(obj.age)
    }

    if(obj !is Person) {
//       println(obj.age)
    }

    val person = obj as? Person
    println(person?.age)
}