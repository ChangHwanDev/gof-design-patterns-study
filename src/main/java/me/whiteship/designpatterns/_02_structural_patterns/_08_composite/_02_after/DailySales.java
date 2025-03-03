package me.whiteship.designpatterns._02_structural_patterns._08_composite._02_after;

public class DailySales implements Sales{
    private double amount;

    public DailySales(double amount) {
        this.amount = amount;
    }

    @Override
    public double getTotalSales() {
        return amount;
    }
}
