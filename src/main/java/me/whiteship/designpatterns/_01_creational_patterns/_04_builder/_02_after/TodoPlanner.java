package me.whiteship.designpatterns._01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;
import java.util.List;

public class TodoPlanner {

    private String title;
    private LocalDate localDate;
    private List<String> todoPlans;

    public TodoPlanner(String title, LocalDate localDate, List<String> todoPlans) {
        this.title = title;
        this.localDate = localDate;
        this.todoPlans = todoPlans;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public List<String> getTodoPlans() {
        return todoPlans;
    }

    public void setTodoPlans(List<String> todoPlans) {
        this.todoPlans = todoPlans;
    }

    @Override
    public String toString() {
        return "TodoPlaner{" +
                "title='" + title + '\'' +
                ", localDate=" + localDate +
                ", todoPlans=" + todoPlans +
                '}';
    }
}
