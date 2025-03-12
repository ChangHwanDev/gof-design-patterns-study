package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._02_after;

import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> history = new Stack<Memento>();

    public void save(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
            return;
        }

        System.out.println("실행 취소할 상태가 없습니다.");
    }
}
