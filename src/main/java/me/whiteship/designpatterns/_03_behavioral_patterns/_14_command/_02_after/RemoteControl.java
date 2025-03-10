package me.whiteship.designpatterns._03_behavioral_patterns._14_command._02_after;

import java.util.Stack;

public class RemoteControl {

    private Stack<Command> commandHistory = new Stack<Command>();

    public void pressButton(Command command) {
        command.execute();
        commandHistory.push(command);
    }

    public void pressUndo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }

    public static void main(String[] args) {
        RemoteCar remoteCar = new RemoteCar();
        RemoteControl remoteControl = new RemoteControl();

        Command moveForward = new MoveForwardCommand(remoteCar);
        Command moveBackward = new MoveBackwardCommand(remoteCar);

        remoteControl.pressButton(moveForward);
        remoteControl.pressButton(moveBackward);
        remoteControl.pressUndo();
        remoteControl.pressUndo();
    }
}
