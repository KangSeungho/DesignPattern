package duck.behavior.quack;

import duck.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("(고무 소리) 찍찍");
    }
}
