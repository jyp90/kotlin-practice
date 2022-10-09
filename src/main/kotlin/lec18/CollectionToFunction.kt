package lec18

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long,
)

val fruits = listOf(
    Fruit(1, "apple", 1_000, 2_000),
    Fruit(2, "apple", 1_000, 2_100),
    Fruit(3, "apple", 1_000, 2_000),
    Fruit(4, "apple", 1_000, 2_200),
    Fruit(5, "apple", 1_000, 2_300),
    Fruit(6, "banana", 1_200, 2_000),
    Fruit(7, "banana", 1_200, 2_100),
    Fruit(8, "banana", 1_200, 2_200),
    Fruit(9, "banana", 1_200, 2_300),
    Fruit(10, "watermelon", 10_000, 12_000),
    Fruit(11, "watermelon", 11_000, 13_000),
)

// filter and map
val apples = fruits.filter { fruit -> fruit.name == "apple"}

val applesWithIndex = fruits.filterIndexed { idx, fruit ->
    println(idx)
    fruit.name == "사과"
}

val applePrices = fruits.filter { fruit -> fruit.name == "apple"}
    .mapIndexed { index, fruit ->
        println(index)
        fruit.currentPrice
    }

val values = fruits.filter { fruit -> fruit.name == "apple"}
    .mapNotNull { fruit -> fruit }
