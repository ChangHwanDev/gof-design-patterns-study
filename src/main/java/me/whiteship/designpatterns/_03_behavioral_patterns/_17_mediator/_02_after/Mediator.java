package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._02_after;

public interface Mediator {

    void addUser(Colleague user);

    void sendMessage(Colleague user, String message);
}
