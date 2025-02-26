package me.whiteship.designpatterns._01_creational_patterns._04_builder._02_after;

public class App {

    public static void main(String[] args) {
        TodoPlannerDirector todoPlannerDirector = new TodoPlannerDirector();
        TodoPlanner hangout = todoPlannerDirector.hangout();
        TodoPlanner study = todoPlannerDirector.study();

        System.out.println(hangout);
        System.out.println(study);
    }
}
