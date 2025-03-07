package me.whiteship.designpatterns._02_structural_patterns._11_flyweight._02_after;

public class MonsterType {
    private final String name;
    private final String texture;

    public MonsterType(String name, String texture) {
        this.name = name;
        this.texture = texture;
    }

    public void display(int x, int y) {
        System.out.println("몬스터 생성: " + name + " (위치: " + x + ", " + y + ") [텍스처: " + texture + "]");
    }
}