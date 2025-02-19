package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;

/**
 * 자바에서 enum 을 사용하지 않고 싱글톤 패턴을 구현하는 방법은?
 * 
 * private 생성자와 static 메소드를 사용하는 방법의 단점은?
 * 
 * enum을 사용해 싱글톤 패턴을 구현하는 방법의 장단점은?
 * 
 * static inner 클래스를 사용해 싱글톤 패턴을 구현하라
 */
public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings5 settings = Settings5.INSTANCE;

        Settings5 settings1 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings5) in.readObject();
        }

        System.out.println(settings == settings1);
    }

}
