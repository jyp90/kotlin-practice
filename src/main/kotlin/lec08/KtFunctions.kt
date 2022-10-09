package lec08

// declaration
fun max(a: Int, b: Int): Int =
    if(a > b) {
        a
    } else {
        b
    }

// shorten
fun maxV2(a: Int, b: Int): Int = if(a > b) a else b

// default parameter
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if(useNewLine) println(str) else println (str)
    }
}

fun main () {
    // named argument
    repeat("Hello World", useNewLine = true)
    printNameAndGender(gender = "F" , name = "jypark")
}


fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}