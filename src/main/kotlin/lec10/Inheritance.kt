package lec10

// abstract
abstract class Animal(
    protected val species: String,
    protected open val legCount: Int,
) {
    abstract fun move()
}

// inheritance using colon (:)
class Cat(
    species: String
) : Animal(species, 4) {
    override fun move() {
        println("cat is moving")
    }
}

class Penguin(
    species: String,
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {}

    override val legCount: Int // need open keyword
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}



// interface
interface Flyable {
    fun act() {
        println("padak")
    }
}

interface Swimable {
    val swimAbility: Int
        get() = 3

    fun act() {
        println(swimAbility)
        println("swimming")
    }
}


// Inheritance Point
/**
 * 1. final : cannot override , default
 * 2. open : open override
 * 3. abstract : always override
 * 4. override : override inheritance
 */
