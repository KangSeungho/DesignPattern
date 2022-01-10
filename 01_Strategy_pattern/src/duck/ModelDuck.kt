package duck

import duck.behavior.FlyNoWay
import duck.behavior.Quack

class ModelDuck : Duck() {
    init {
        setQuackBehavior(Quack())
        setFlyBehavior(FlyNoWay())
    }

    override fun display() {
        println("저는 모형 오리입니다.")
    }
}