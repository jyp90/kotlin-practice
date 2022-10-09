package lec14

fun main() {
    val person1 = PersonDTO("jypark", 100)
    val person2 = PersonDTO("jypark", 100)
    println(person1 == person2) // true
}
// data class
data class PersonDTO(
    val name: String,
    val age: Int,
)

// enum class
enum class Country(
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US"),
    JAPAN("JP"),
}

// return 이 있는 경우도 작성하지 않아도 됨
fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
        else -> {}
    }
}

// Sealed Class, Sealed Interface
sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반테", 2_000L)
class Grandeur : HyundaiCar("그랜져", 3_000L)
class Sonata : HyundaiCar("소나타", 1_000L)

private fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}