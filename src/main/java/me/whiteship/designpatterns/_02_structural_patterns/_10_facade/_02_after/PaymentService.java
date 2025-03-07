package me.whiteship.designpatterns._02_structural_patterns._10_facade._02_after;

public class PaymentService {
    public boolean processPayment(String account, double amount) {
        System.out.println("[결제 처리] " + account + " 계정에서 " + amount + "원 결제 완료.");
        return true;
    }
}
