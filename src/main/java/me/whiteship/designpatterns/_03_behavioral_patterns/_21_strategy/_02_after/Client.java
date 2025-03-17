package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._02_after;

import java.util.Collections;
import java.util.Comparator;

public class Client {

    public static void main(String[] args) {
        Strategy concreteStrategyA = new ConcreteStrategyA();
        Context context = new Context(concreteStrategyA);

        context.performStrategy("WELCOME!!");

        Strategy concreteStrategyB = new ConcreteStrategyB();
        context.setStrategy(concreteStrategyB);

        context.performStrategy("WELCOME!!");
    }
}
