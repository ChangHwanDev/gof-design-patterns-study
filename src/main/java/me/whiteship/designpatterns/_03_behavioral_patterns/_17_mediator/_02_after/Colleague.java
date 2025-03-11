package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._02_after;

public abstract class Colleague {
    protected Mediator mediator;
    protected String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}
