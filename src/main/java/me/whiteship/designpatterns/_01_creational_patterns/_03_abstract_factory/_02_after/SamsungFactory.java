package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.DefaultPhoneFactory;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Phone;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Samsung;

public class SamsungFactory extends DefaultPhoneFactory {

    private PhonePartsFactory phonePartsFactory;

    public SamsungFactory(PhonePartsFactory phonePartsFactory) {
        this.phonePartsFactory = phonePartsFactory;
    }

    @Override
    public Phone createPhone() {
        Phone phone = new Samsung();
        phone.setWatch(new GalaxyWatch());
        phone.setWirelessEarphones(new GalaxyBuds3());
        return phone;
    }
}
