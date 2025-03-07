package me.whiteship.designpatterns._02_structural_patterns._10_facade._02_after;

public class ShippingService {
    public void shipOrder(String item) {
        System.out.println("[배송 처리] " + item + " 배송 시작!");
    }
}
