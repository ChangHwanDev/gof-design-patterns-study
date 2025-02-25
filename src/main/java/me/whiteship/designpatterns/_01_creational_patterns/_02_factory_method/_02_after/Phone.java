package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after;

import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after.Watch;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after.WirelessEarphones;

public class Phone {

    private String brand;
    private String model;
    private String color;
    private WirelessEarphones wirelessEarphones;
    private Watch watch;

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

    public WirelessEarphones getWirelessEarphones() {
        return wirelessEarphones;
    }

    public void setWirelessEarphones(WirelessEarphones wirelessEarphones) {
        this.wirelessEarphones = wirelessEarphones;
    }

    public Watch getWatch() {
        return watch;
    }

    public void setWatch(Watch watch) {
        this.watch = watch;
    }

    @Override
    public String toString() {
        return "Phone [brand=" + brand + ", model=" + model + ", color=" + color +
                " watch= " + watch +
                " wirelessEarphones=" + wirelessEarphones + "]";
    }
}
