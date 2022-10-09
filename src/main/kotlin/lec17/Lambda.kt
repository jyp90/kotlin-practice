package lec17

import com.lannstark.lec17.Fruit

val fruits = listOf(
    Fruit("apple", 1_000),
    Fruit("apple", 1_200),
    Fruit("apple", 1_200),
    Fruit("apple", 1_500),
    Fruit("banana", 1_600),
    Fruit("banana", 1_700),
    Fruit("banana", 1_700),
    Fruit("watermelon", 2_000),
    Fruit("melon", 10_000),
)
// Kotlin Lambda
fun main() {

    // lambda 1
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isAppleL: (Fruit) -> Boolean = fun(fruit: Fruit) : Boolean {
        return fruit.name == "사과"
    }

    // lambda 2
    val isApple2 = { fruit: Fruit -> fruit.name == "사과"}

    isApple(fruits[0])
    isApple.invoke(Fruit("apple", 1_000))

    filterFruits(fruits, isAppleL)
    filterFruits(fruits) { a -> a.name == "사과"}
    filterFruits(fruits) { it.name == "사과"}

}


private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for(fruit in fruits) {
        if(filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}

// Closure
fun closure() {
    var target = "apple"
    target = "banana"
    filterFruits(fruits) { it.name == target }
}


// try with resources