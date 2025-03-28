package me.whiteship.designpatterns._03_behavioral_patterns._19_observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {
    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void register(String subject, Subscriber subscriber) {
        if (subscribers.containsKey(subject)) {
            subscribers.get(subject).add(subscriber);
            return;
        }
        List<Subscriber> list = new ArrayList<>();
        list.add(subscriber);
        this.subscribers.put(subject, list);
    }

    public void unregister(String subject, Subscriber subscriber) {
        if (subscribers.containsKey(subject)) {
            subscribers.get(subject).remove(subscriber);
        }
    }

    public void notify(String subject, String message) {
        if (subscribers.containsKey(subject)) {
            subscribers.get(subject).forEach(subscriber -> {
                subscriber.handleMessage(message);
            });
        }
    }
}
