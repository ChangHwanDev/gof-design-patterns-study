package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._02_after;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void execute(String input) {
        System.out.println("ConcreteStrategyA executing: " + input.toLowerCase());
    }
}
