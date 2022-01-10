package duck

import duck.behavior.QuackBehavior
import duck.behavior.FlyBehavior

abstract class Duck {
    private var quackBehavior: QuackBehavior? = null

    private var flyBehavior: FlyBehavior? = null

    abstract fun display()
    fun setFlyBehavior(flyBehavior: FlyBehavior?) {
        this.flyBehavior = flyBehavior
    }

    fun setQuackBehavior(quackBehavior: QuackBehavior?) {
        this.quackBehavior = quackBehavior
    }

    fun performFly() {
        flyBehavior?.fly()
    }

    fun performQuack() {
        quackBehavior?.quack()
    }

    fun swim() {
        println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠")
    }
}