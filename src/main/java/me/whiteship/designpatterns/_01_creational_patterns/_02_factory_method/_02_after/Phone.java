package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after;

public class Phone {

    private String brand;
    private String model;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone [brand=" + brand + ", model=" + model + ", color=" + color + "]";
    }
}
