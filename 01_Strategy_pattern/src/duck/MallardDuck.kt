package duck

import duck.behavior.FlyWithWings
import duck.behavior.Quack

class MallardDuck : Duck() {
    init {
        setQuackBehavior(Quack())
        setFlyBehavior(FlyWithWings())
    }

    override fun display() {
        println("저는 물오리입니다.")
    }
}