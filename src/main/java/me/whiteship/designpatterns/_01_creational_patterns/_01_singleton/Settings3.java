package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

/**
 * double checked locking으로 효율적인 동기화 블럭 만들기
 */
public class Settings3 {

    private static volatile Settings3 INSTANCE;

    private Settings3() { }

    public static Settings3 getInstance() {
        if (INSTANCE == null) {
            synchronized (Settings3.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Settings3();
                }
            }
        }

        return INSTANCE;
    }

}
