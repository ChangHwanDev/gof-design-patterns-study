package me.whiteship.designpatterns._02_structural_patterns._12_proxy._02_after;

public class Client {

    public static void main(String[] args) {
        Service service = new LoggingProxy(new RealService());
        service.execute();
    }
}
