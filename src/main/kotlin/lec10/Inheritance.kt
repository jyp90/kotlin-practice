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
) : Animal(species, 2) {

    private val wingCount: Int = 2

    override fun move() {

    }

    override val legCount: Int // need open keyword
        get() = super.legCount + this.wingCount
}
// interface

// warning point

