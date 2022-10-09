package lec05

import java.lang.IllegalArgumentException

fun validateScoreIsNotNegative(score: Int) {
    if(score !in 0..100) {
        throw IllegalArgumentException("$score is range of 0 to 100")
    }
}

fun getPassOrFail(score: Int): String {
    return if(score >= 50) {
        "P"
    }
    else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if(score >= 90) {
        "A"
    } else if(score >= 80) {
        "B"
    } else if(score >= 70) {
        "C"
    } else {
        "F"
    }
}