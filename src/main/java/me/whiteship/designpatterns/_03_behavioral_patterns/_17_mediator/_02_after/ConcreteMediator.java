package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._02_after;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private final List<Colleague> users;

    public ConcreteMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(Colleague user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(Colleague user, String message) {
        for (Colleague u : users) {
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
