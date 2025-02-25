package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after;

public class SamsungFactory extends DefaultPhoneFactory {
    @Override
    public Phone createPhone() {
        return new Samsung();
    }
}
