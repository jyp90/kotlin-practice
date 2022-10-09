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

// many collection processor
// all : 전체이어야만 true
val isAllApple = fruits.all { fruit -> fruit.name == "apple"}
// none : 전체가 아니어야만 true
val isNoApple = fruits.none { fruit -> fruit.name == "apple"}
// any : 조건을 하나라도 만족하면 true,
val isAnyApple = fruits.any { fruit -> fruit.name == "apple"}
// count :
val fruitCount = fruits.count()
// sort
val fruitSort = fruits.sortedBy { fruit -> fruit.currentPrice }
val fruitSortDesc = fruits.sortedByDescending { fruit -> fruit.currentPrice }
// distinct
val distinctFruitsByName = fruits.distinctBy { fruit: Fruit -> fruit.name }
// first & firstOrNull
val firstFruit = fruits.first()
val fruitFirstOrNull = fruits.firstOrNull()
// last & lastOrNull
val lastFruit = fruits.last()
val lastFruitOrNull = fruits.lastOrNull()

// List to map
// key : fruit.name, value = List
val groupByName: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
// key : fruit.id, value = fruit
val associated: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }
// key : fruit.name, value List<Fruit.factoryPrice>
val factoryPriceMapByName: Map<String, List<Long>> = fruits.groupBy({ fruit -> fruit.name}, {fruit -> fruit.factoryPrice})
// key : fruit.id, value fruit.factoryPrice
val factoryPriceById: Map<Long, Long> = fruits.associateBy({ fruit -> fruit.id}, { fruit -> fruit.factoryPrice})

// with filter
fun collection() {
    groupByName.filter { (key, value) -> key == "apple" }
}
