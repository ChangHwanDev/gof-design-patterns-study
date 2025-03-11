package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._02_after;

public class ConcreteColleague extends Colleague{

    public ConcreteColleague(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + ": Sending Message=> " + message);
        mediator.sendMessage(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + ": Receiving Message=> " + message);
    }
}
