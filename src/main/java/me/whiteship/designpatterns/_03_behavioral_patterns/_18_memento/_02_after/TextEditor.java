package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._02_after;

public class TextEditor {

    private String content = "";

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Memento save() {
        return new Memento(content);
    }

    public void restore(Memento memento) {
        this.content = memento.getState();
    }
}
