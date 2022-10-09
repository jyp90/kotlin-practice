package lec03

import com.lannstark.lec03.Person

fun main() {
    val person = Person("name", 100)
    println("name: ${person.name} / age : ${person.age}")

    val name = "name"
    println("name : ${name}")

    """
        ABCD
        EFG
        HIJK
        LMN
        OPQR
        STU
        ${name}
    """.trimIndent()

    val str = "ABC"
    println(str[0]) // str.charAt(0)
}