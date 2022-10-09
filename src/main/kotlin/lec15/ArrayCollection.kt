package lec15

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


// 3. nullable