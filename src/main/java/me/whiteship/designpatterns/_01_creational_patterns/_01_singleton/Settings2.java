package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

/**
 * Thread safe initialization
 * synchronized 사용해서 동기화 처리
 * 동기화 작업으로 인한 비용이 발생할 수 있다.
 */
public class Settings2 {

    private static Settings2 INSTANCE;

    private Settings2() { }

    public static synchronized Settings2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Settings2();
        }

        return INSTANCE;
    }

}
