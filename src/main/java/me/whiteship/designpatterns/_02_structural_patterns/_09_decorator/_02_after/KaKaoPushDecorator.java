package me.whiteship.designpatterns._02_structural_patterns._09_decorator._02_after;

public class KaKaoPushDecorator extends PushDecorator {
    public KaKaoPushDecorator(PushService pushService) {
        super(pushService);
    }

    @Override
    public void sendPush(String message) {
        super.sendPush(message);
        sendKaKaoPush(message);
    }

    private void sendKaKaoPush(String message) {
        System.out.println("[카카오 푸시] 📢 카카오톡 알림: " + message);
    }
}
