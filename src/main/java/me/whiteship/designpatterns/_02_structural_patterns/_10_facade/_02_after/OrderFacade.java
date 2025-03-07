package me.whiteship.designpatterns._02_structural_patterns._10_facade._02_after;

public class OrderFacade {
    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String item, String account, double amount) {
        System.out.println("\n=== 주문 시작 ===");

        if (!inventoryService.checkStock(item)) {
            System.out.println("[오류] 재고 부족으로 주문 실패!");
            return;
        }

        if (!paymentService.processPayment(account, amount)) {
            System.out.println("[오류] 결제 실패로 주문 취소!");
            return;
        }

        shippingService.shipOrder(item);

        System.out.println("주문 완료!");
    }
}
