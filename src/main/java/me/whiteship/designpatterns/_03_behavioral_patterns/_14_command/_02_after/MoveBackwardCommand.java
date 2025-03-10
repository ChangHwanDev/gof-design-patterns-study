package me.whiteship.designpatterns._03_behavioral_patterns._14_command._02_after;

public class MoveBackwardCommand implements Command {

    private RemoteCar car;

    public MoveBackwardCommand(RemoteCar car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.moveBackward();
    }

    @Override
    public void undo() {
        car.stop();
        System.out.println("실행 취소 : 자동차가 후진을 멈춥니다.");
    }
}
