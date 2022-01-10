package duck.behavior

interface FlyBehavior {
    fun fly()
}

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("저는 못 날아요")
    }
}

class FlyRocketPowered : FlyBehavior {
    override fun fly() {
        println("로켓 추진으로 날아갑니다")
    }
}

class FlyWithWings : FlyBehavior {
    override fun fly() {
        println("날고 있어요!!")
    }
}