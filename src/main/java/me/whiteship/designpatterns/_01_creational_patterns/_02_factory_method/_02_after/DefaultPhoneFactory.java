package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after;

public abstract class DefaultPhoneFactory implements PhoneFactory {

    @Override
    public void sendCustomer() {
        System.out.println("배송이 시작되었습니다.");
    }
}
