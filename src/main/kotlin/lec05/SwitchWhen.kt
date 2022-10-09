package lec05

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitchRange(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithAOfType(obj: Any): Boolean {
    return when(obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("there are many seen")
        else -> println("$number input")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("there is zero value")
        number % 2 == 0 -> println("$number is even")
        else -> println("$number is odd")
    }
}

