package lec12

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

// object