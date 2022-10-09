package lec13

// 중첩클래스
fun main() {

}

class JavaHouse(
    private val address: String,
    private val livingRoom: LivingRoom = LivingRoom(10.0)
) {
    class LivingRoom(
        private val area: Double
    )
}
