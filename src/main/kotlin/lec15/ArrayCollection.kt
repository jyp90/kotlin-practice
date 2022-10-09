package lec15

import java.util.*

// 1. array
fun main() {
    val array = arrayOf(100, 200)
    // index
    for(i in array.indices) {
        println("$i $array[i]")
    }

    // index, value
    for((idx, value) in array.withIndex()) {
        println("$idx $value")
    }
    // add
    array.plus(300)
}

// 2. collection - list, set, map
fun list() {
    // immutable
    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()
    printNumbers(emptyList)

    println(numbers[0])

    for(number in numbers) {
        println(number)
    }

    for((idx, value) in numbers.withIndex()) {
        println("$idx , $value")
    }

    // mutable
    val number2 = mutableListOf(100, 200)
    number2.add(300)
}

fun set() {
    // immutable
    val number = setOf(100, 200)
    val emptySet = emptySet<Int>();

    // mutable
    val number2 = mutableSetOf(100, 200)
    number2.add(300)
}

fun map() {
    val oldMap = mutableMapOf<Int, String>()
    // map[key] = value
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    val usingPairClassMap = mapOf(1 to  "MONDAY", 2 to "TUESDAY")

    for(key in oldMap.keys) {
        println("$key $oldMap[key")
    }

    for((key, value) in oldMap.entries) {
        println("$key $value")
    }
}

private fun printNumbers(numbers: List<Int>) {
    for(number in numbers) {
        println(number);
    }
}

// 3. nullable
// List<Int?> : list nonnull, element nullable
// List<Int>? : list nullable, element nonnull
// List<Int?>?  : list nullable, element nullable
fun nullable() {
    val list1 : List<Int?>
    val list2 : List<Int>?
    val list3 : List<Int?>?
}

// collections modifier prevent
fun unmodifiable() {
    val list = listOf(10, 20, 30)
    val un1 = Collections.unmodifiableList(list)

}