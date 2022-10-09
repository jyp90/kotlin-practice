package lec09

import java.lang.IllegalArgumentException

class Person( // primary constructor, never null
    name: String = "jypark",
    var age: Int
) {
    var name = name
        set(value) { // custom setter
            field = value.uppercase()
        }

    init { // initial constructor
        if(age <= 0) {
            throw IllegalArgumentException("$age is not less than 0")
        }
    }

    constructor(name: String): this(name, 1) // baby creator, call default constructor

    constructor(): this("defaultName") {
        println("possible to create body")
    }

    fun isAdultV1(): Boolean {
        return this.age >= 20
    }

    val isAdult: Boolean
        get() = this.age >= 20
}

fun main() {
    val person = Person("jypark", 100)
    println(person.name) // getter
    println(person.age) // getter
    person.age = 10 // setter
    println(person.age) // 10

    val baby = Person("baby")
    val defaultPerson = Person()

    val adult = person.isAdult
    val adultV1 = person.isAdultV1()
    println(adult)
    println(adultV1)
}