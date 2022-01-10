package duck.behavior

interface QuackBehavior {
    fun quack()
}

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("(무음)")
    }
}

class Quack : QuackBehavior {
    override fun quack() {
        println("꽥꽥")
    }
}

class Squeak : QuackBehavior {
    override fun quack() {
        println("(고무 소리) 찍찍")
    }
}
