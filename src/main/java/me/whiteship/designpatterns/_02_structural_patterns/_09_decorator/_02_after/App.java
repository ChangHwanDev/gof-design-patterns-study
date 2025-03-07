package me.whiteship.designpatterns._02_structural_patterns._09_decorator._02_after;

public class App {

    private static boolean enabledKakaoPush = true;

    public static void main(String[] args) {
        PushService pushService = new DefaultPushService();

        if (enabledKakaoPush) {
            pushService = new KaKaoPushDecorator(pushService);
        }

        Client client = new Client(pushService);
        client.writeComment("책임님 안녕하세요.");
        client.writeComment("A 업무 관련으로 확인 요청드릴게 있습니다.");
    }
}
