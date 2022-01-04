package duck.behavior.quack;

import duck.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("(무음)");
    }
}
