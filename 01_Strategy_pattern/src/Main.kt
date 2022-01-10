import kotlin.jvm.JvmStatic
import duck.Duck
import duck.MallardDuck
import duck.ModelDuck
import duck.behavior.FlyRocketPowered

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val mallard: Duck = MallardDuck()
        mallard.performQuack()
        mallard.performFly()

        val model: Duck = ModelDuck()
        model.performFly()
        model.setFlyBehavior(FlyRocketPowered())
        model.performFly()
    }
}