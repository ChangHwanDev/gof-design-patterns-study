package me.whiteship.designpatterns._03_behavioral_patterns._19_observer;

public class User implements Subscriber{

    String name;

    public User(String name) {
        this.name = name;
    }

    public void handleMessage(String message) {
        System.out.println(this.name + "Get : " + message);
    }
}
