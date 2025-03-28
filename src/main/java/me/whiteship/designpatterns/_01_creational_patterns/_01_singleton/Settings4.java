package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

/**
 * Bill Pugh Solution (LazyHolder)
 * static inner 클래스 홀더
 */
public class Settings4 {

    private Settings4() { }

    private static class Settings4Holder {
        private static final Settings4 INSTANCE = new Settings4();
    }

    public static Settings4 getInstance() {
        return Settings4Holder.INSTANCE;
    }

}
