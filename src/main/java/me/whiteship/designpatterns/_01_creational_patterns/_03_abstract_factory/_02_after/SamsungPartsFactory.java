package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

public class SamsungPartsFactory implements PhonePartsFactory{

    @Override
    public Watch createWatch() {
        return new GalaxyWatch();
    }

    @Override
    public WirelessEarphones createEarphones() {
        return new GalaxyBuds3();
    }
}
