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