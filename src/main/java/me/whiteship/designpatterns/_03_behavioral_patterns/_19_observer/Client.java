package me.whiteship.designpatterns._03_behavioral_patterns._19_observer;

public class Client {

    public static void main(String[] args) {
        Subscriber user1 = new User("창환");
        Subscriber user2 = new User("창환이");
        Subscriber user3 = new User("창환삼");

        ChatServer chatServer = new ChatServer();
        chatServer.register("자바스터디", user1);
        chatServer.register("자바스터디", user2);
        chatServer.register("자바스터디", user3);

        chatServer.notify("자바스터디", "3월 14일 19강 학습");
        
        chatServer.unregister("자바스터디", user2);
        chatServer.notify("자바스터디", "3월 15일 20강 학습");
        
        chatServer.register("코틀린스터디", user1);
        chatServer.register("코틀린스터디", user2);
        
        chatServer.notify("코틀린스터디", "코루틴 관련 주제 발표");
    }
}
