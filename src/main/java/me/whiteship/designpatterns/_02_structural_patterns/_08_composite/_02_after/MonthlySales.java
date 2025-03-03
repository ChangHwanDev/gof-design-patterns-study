package me.whiteship.designpatterns._02_structural_patterns._08_composite._02_after;

import java.util.ArrayList;
import java.util.List;

public class MonthlySales implements Sales{
    private List<Sales> dailySalesList = new ArrayList<Sales>();

    public void add(Sales sales) {
        dailySalesList.add(sales);
    }

    @Override
    public double getTotalSales() {
        return dailySalesList.stream()
                .mapToDouble(Sales::getTotalSales)
                .sum();
    }
}
