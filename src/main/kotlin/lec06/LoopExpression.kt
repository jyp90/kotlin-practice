package lec06

fun main() {
    val numbers = listOf(1L, 2L, 3L) // create collection
    for (number in numbers) { // using in as iterable
        println(number)
    }

    // asc
    for (i in 1..3) { // range expression
        println(i) // 1, 2, 3
    }

    // desc
    for(i in 3 downTo 1) {
        println(i) // 3, 2, 1
    }

    // plus 2
    for(i in 1..5 step 2) {
        println(i) // 1, 3, 5
    }

    // using do while
    var i = 1
    while(i <= 3) { // same as java
        println(i)
    }
}