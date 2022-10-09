package lec19

import lec18.Fruit

// Type Alias
// 긴 이름의 클래스 혹은 함수 타입이 있을 때 축약하거나 더 좋은 이름을 쓰고 싶은 경우
fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean) {

}

typealias FruitFilter = (Fruit) -> Boolean
fun filterFruitsV2(fruits: List<Fruit>, filter: FruitFilter) {

}

data class UltraSuperGuardianForceTribe(
    val name: String
)

typealias USGFTMap = Map<String, UltraSuperGuardianForceTribe>
