package me.whiteship.designpatterns._02_structural_patterns._10_facade._02_after;

public class InventoryService {
    public boolean checkStock(String item) {
        System.out.println("[재고 확인] " + item + " 재고 확인 중...");
        return true;
    }
}
