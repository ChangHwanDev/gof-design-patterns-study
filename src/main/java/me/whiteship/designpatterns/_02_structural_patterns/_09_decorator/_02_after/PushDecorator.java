package me.whiteship.designpatterns._02_structural_patterns._09_decorator._02_after;

public class PushDecorator implements PushService{

    private PushService pushService;

    public PushDecorator(PushService pushService) {
        this.pushService = pushService;
    }

    @Override
    public void sendPush(String message) {
        pushService.sendPush(message);
    }
}
