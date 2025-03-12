package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._02_after;

public class Memento {

    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
