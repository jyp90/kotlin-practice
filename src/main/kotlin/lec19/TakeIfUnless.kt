package lec19

fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

fun getNumberOrNullV2(number: Int): Int? {
    return number.takeIf { it > 0 }
}

fun getNumberOrNullV3(number: Int): Int? {
    return number.takeUnless { it <= 0 }
}