package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new IPhoneFactory(), "정창환", "changhwandev@mail.com");
        client.print(new SamsungFactory(), "정창환2", "hwan@mail.com");
    }

    private void print(PhoneFactory phoneFactory, String name, String email) {
        System.out.println(phoneFactory.orderPhone(name, email));
    }

}
