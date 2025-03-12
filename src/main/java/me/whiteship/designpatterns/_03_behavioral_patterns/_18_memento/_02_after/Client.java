package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._02_after;

public class Client {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        textEditor.setContent("안녕하세요.");
        caretaker.save(textEditor);
        System.out.println("현재 상태: " + textEditor.getContent());

        textEditor.setContent("반갑습니다.");
        caretaker.save(textEditor);
        System.out.println("현재 상태: " + textEditor.getContent());

        textEditor.setContent("제 이름은");
        System.out.println("현재 상태: " + textEditor.getContent());

        caretaker.undo(textEditor);
        System.out.println("실행 취소 후 상태: " + textEditor.getContent());

        caretaker.undo(textEditor);
        System.out.println("실행 취소 후 상태: " + textEditor.getContent());

        caretaker.undo(textEditor);
        System.out.println("실행 취소 후 상태: " + textEditor.getContent());
    }
}
