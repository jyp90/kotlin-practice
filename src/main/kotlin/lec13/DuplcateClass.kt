package lec13

// 중첩클래스
fun main() {

}

class JavaHouse(
    private val address: String,
) {
    val livingRoom: LivingRoom = this.LivingRoom(10.0)
    // inner class
    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@JavaHouse.address // 바깥클래스를 사용하기 위해 this@
    }
}
