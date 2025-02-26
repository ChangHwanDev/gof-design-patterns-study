package me.whiteship.designpatterns._01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTodoPlannerBuilder implements TodoPlannerBuilder{

    private String title;
    private LocalDate localDate;
    private final List<String> todoPlans = new ArrayList<>();

    @Override
    public TodoPlannerBuilder title(String titie) {
        this.title = titie;
        return this;
    }

    @Override
    public TodoPlannerBuilder startDate(LocalDate localDate) {
        this.localDate = localDate;
        return this;
    }

    @Override
    public TodoPlannerBuilder addTodoPlan(String todoPlans) {
        this.todoPlans.add(todoPlans);
        return this;
    }

    @Override
    public TodoPlanner getTodoPlan() {
        return new TodoPlanner(this.title, this.localDate, this.todoPlans);
    }
}
