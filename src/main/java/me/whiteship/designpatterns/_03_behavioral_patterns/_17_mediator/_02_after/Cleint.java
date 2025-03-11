package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._02_after;

public class Cleint {

    public static void main(String[] args) throws InterruptedException {
        Mediator mediator = new ConcreteMediator();
        Colleague user1 = new ConcreteColleague(mediator, "환");
        Colleague user2 = new ConcreteColleague(mediator, "정");
        mediator.addUser(user1);
        mediator.addUser(user2);

        user1.send("안녕하세요");
    }
}
