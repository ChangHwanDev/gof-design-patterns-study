package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.DefaultPhoneFactory;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.IPhone;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Phone;

public class AppleFactory extends DefaultPhoneFactory {
    private PhonePartsFactory phonePartsFactory;

    public AppleFactory(PhonePartsFactory phonePartsFactory) {
        this.phonePartsFactory = phonePartsFactory;
    }

    @Override
    public Phone createPhone() {
        Phone phone = new IPhone();
        phone.setWatch(new AppleWatch());
        phone.setWirelessEarphones(new AirPods());
        return phone;
    }
}
