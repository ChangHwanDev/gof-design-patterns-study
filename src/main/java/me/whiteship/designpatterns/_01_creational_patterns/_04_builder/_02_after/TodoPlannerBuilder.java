package me.whiteship.designpatterns._01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;

public interface TodoPlannerBuilder {

    TodoPlannerBuilder title(String titie);

    TodoPlannerBuilder startDate(LocalDate localDate);

    TodoPlannerBuilder addTodoPlan(String todoPlans);

    TodoPlanner getTodoPlan();
}
