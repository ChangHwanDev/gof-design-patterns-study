package me.whiteship.designpatterns._02_structural_patterns._07_bridge._02_after;

public class Brush {

    Color color;

    public Brush(Color color) {
        this.color = color;
    }

    public void brush(String name) {
        System.out.printf("%s %s brush", name, color.getColor());
    }
}
