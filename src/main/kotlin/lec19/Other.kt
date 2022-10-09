package lec19

data class Person(
    val name: String,
    val age: Int
) {
    // custom
    operator fun component11(): String {
        return this.name
    }

    // custom
    operator fun component22(): Int {
        return this.age
    }
}

// 구조분해와 componentN function
fun main() {
    val person = Person("jypark", 100)
    val (name, age) = person
    val nameC = person.component1() // 1st
    val ageC = person.component2() // 2nd

    println("$name, $age")
    println("$nameC, $ageC")
}

// Jump label
// break, continue, return
// break = loop@ , break@loop
// continue = run { return@forEach }
// return = run { return@run }
fun jump1() {
    val list = listOf(1, 2, 3)
    run {
        list.forEach { number ->
            if(number == 2) {
                return@run
            }
        }
    }
    // 1
    run {
        list.forEach { number ->
            if(number == 2) {
                return@forEach
            }
        }
    }
    // 1, 3
}

// not recommended
fun label() {
    loop@ for (i in 1..100) {
        for(j in 1..100) {
            if(j == 2) {
                break@loop
            }
            print("$i, $j")
        }
    }
} // 1 1 하고 종료
