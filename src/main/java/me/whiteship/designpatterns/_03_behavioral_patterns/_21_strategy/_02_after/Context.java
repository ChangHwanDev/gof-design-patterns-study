package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._02_after;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void performStrategy(String input) {
        if (strategy != null) {
            strategy.execute(input);
        } else {
            System.out.println("Strategy is null");
        }
    }
}
