package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

/**
 * Lazy initialization
 * private 생성자와 public static 메소드를 사용하는 방법
 * Thread Safe 하지 않는 단점
 */
public class Settings1 {

    private static Settings1 INSTANCE;

    private Settings1() { }

    public static Settings1 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Settings1();
        }

        return INSTANCE;
    }

}
