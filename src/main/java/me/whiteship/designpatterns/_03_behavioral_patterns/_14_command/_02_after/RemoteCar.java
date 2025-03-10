package me.whiteship.designpatterns._03_behavioral_patterns._14_command._02_after;

public class RemoteCar {

    public void moveForward() {
        System.out.println("자동차가 전진합니다.");
    }

    public void moveBackward() {
        System.out.println("자동차가 후진합니다.");
    }

    public void stop() {
        System.out.println("자동차가 정지합니다.");
    }
}
