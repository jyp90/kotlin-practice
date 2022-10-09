package lec20

import com.lannstark.lec03.Person

// scope function : 일시적인 영역 함수
fun printPerson(person: Person?) {
    if(person != null) {
        println(person.name)
        println(person.age)
    }
}
fun printPersonV2(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}
val person = Person("jypark", 100)
val let = person.let {
    it.age
} // return person?.age
val run = person.run {
    this.age
} // return person.age
val also = person.also {
    it.age
} // return Person
val apply = person.apply {
    this.age
} // return Person
val with = with(person) {
    println(name)
    println(this)
}

// using let
val strings = listOf("apple", "banana", "car")
val usinglet = strings.map { it.length }
    .filter { it > 3 }
    .let { lengths -> println(lengths) }

// using run
//val savedPerson = Person("jypark", 100).run { personRepository::save}

// using also
fun usingAlso() {
    mutableListOf("one", "two")
        .also { println("The list elements before adding new one: $it")}
        .add("three")

    val numbers = mutableListOf("one", "two")
    println("The list elements before adding new one: $numbers")
    numbers.add("three")
}

//using with
