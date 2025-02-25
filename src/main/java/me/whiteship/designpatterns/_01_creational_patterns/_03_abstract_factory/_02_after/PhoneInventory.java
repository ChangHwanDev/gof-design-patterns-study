package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Phone;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.PhoneFactory;

public class PhoneInventory {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new SamsungFactory(new SamsungPartsFactory());
        Phone phone = phoneFactory.createPhone();
        System.out.println(phone);
        System.out.println(phone.getWatch().getClass());
        System.out.println(phone.getWirelessEarphones().getClass());
    }
}
