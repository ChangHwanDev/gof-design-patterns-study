package me.whiteship.designpatterns._02_structural_patterns._09_decorator._02_after;

public class Client {

    private PushService pushService;

    public Client(PushService pushService) {
        this.pushService = pushService;
    }

    public void writeComment(String message) {
        pushService.sendPush(message);
    }
}
