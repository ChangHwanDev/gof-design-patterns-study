package me.whiteship.designpatterns._02_structural_patterns._11_flyweight._02_after;

public class Monster {
    private final int x;
    private final int y;
    private final MonsterType monsterType;

    public Monster(int x, int y, MonsterType monsterType) {
        this.x = x;
        this.y = y;
        this.monsterType = monsterType;
    }

    public void render() {
        monsterType.display(x, y);
    }
}