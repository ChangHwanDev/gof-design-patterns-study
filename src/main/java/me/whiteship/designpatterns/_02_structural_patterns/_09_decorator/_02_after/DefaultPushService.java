package me.whiteship.designpatterns._02_structural_patterns._09_decorator._02_after;

public class DefaultPushService implements PushService {
    @Override
    public void sendPush(String message) {
        System.out.println("[기본 푸시] " + message);
    }
}
