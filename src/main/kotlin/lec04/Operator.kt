package lec04

import com.lannstark.lec04.JavaMoney

fun main() {

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if(money1 > money2) {
        println("money1 > money2")
    }

    val money3 = money1
    val money4 = JavaMoney(1_000L)

    println(money1 === money3) // true (same address)
    println(money1 === money2) // false (not same address)
    println(money1 == money4) // true (same value)

    if(fun1() || fun2()) {

    }
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return true
}