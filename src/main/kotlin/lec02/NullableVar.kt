package lec02

import java.lang.IllegalArgumentException

class NullableVar {


}

fun main() {

    val str: String? = "ABC"
//    str.length
    // Safe call
    str?.length

    // Elvis
    str?.length ?: 0
}

fun startsWithA1(str: String?): Boolean {
    if(str == null) {
        throw IllegalArgumentException("null")
    }
    return str.startsWith("A")
}

fun startsWithA1Safe(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null")
}

fun startsWithA2(str: String?): Boolean? {
    if(str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA2Safe(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if(str == null) {
        return false
    }
    return str.startsWith("A")
}

fun startsWithA3Safe(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startWith(str: String?): Boolean {
    return str!!.startsWith("A") // str is never null
    // runtime exception
}