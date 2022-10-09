package lec12

import com.lannstark.lec12.Movable

// static : 클래스가 인스턴스화 할 때 새로운 값이 복제되는게 아니라 정적으로 인스턴스끼리의 값을 공유
// companion object : 클래스와 동행하는 유일한 오브젝트
class Person private constructor(
    var name: String,
    var age: Int,
) {
    // static
    companion object Factory : Log {
        private const val MIN_AGE = 1

        @JvmStatic // possible to use Person.newBaby("A");
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("I am Person class of companion object Factory")
        }
    }
}

interface Log {
    fun log()
}

// singleton
object Singleton {
    var a: Int = 0
}

fun main() {
    println(Singleton.a) // 1
    Singleton.a += 10
    println(Singleton.a) // 11

    moveSomething(object: Movable {
        override fun move() {
            println("Move")
        }

        override fun fly() {
            println("Fly")
        }
    })
}

// 익명클래스 : 특정 인터페이스나 클래스를 상속받은 구현체를 일회성으로 사용할 때 쓰는 클래스
private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}