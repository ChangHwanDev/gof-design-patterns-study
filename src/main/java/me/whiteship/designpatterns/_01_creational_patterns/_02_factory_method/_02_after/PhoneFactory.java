package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after;

public interface PhoneFactory {

    default Phone orderPhone(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Phone phone = createPhone();
        sendCustomer();
        return phone;
    }
    void sendCustomer();

    Phone createPhone();

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("주문자 이름을 제대로 입력해주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("이메일 정보를 확인해주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + "님에게 배송 준비 중");
    }
}
