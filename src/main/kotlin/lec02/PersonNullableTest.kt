package lec02

import com.lannstark.lec01.Person

class PersonNullableTest {
}

fun main() {
    val person = Person("123123")
    startsWithA(person.name) // @Nullable error
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}