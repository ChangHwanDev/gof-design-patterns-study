package me.whiteship.designpatterns._01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;

public class TodoPlannerDirector {

    public TodoPlanner hangout() {
        return new DefaultTodoPlannerBuilder().title("여자친구")
                .startDate(LocalDate.of(2025, 2, 27))
                .addTodoPlan("밥 먹기")
                .addTodoPlan("영화 보기")
                .getTodoPlan();
    }

    public TodoPlanner study() {
        return new DefaultTodoPlannerBuilder().title("공부")
                .startDate(LocalDate.of(2025, 3, 3))
                .addTodoPlan("알고리즘")
                .addTodoPlan("디자인패턴")
                .getTodoPlan();
    }
}
