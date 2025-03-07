package me.whiteship.designpatterns._02_structural_patterns._11_flyweight._02_after;

public class Client {

    public static void main(String[] args) {
        MonsterType goblinType = MonsterFactory.getMonsterType("고블린", "goblin.png");
        MonsterType orcType = MonsterFactory.getMonsterType("오크", "orc.png");

        Monster m1 = new Monster(10, 20, goblinType);
        Monster m2 = new Monster(15, 25, goblinType);
        Monster m3 = new Monster(30, 40, orcType);

        m1.render();
        m2.render();
        m3.render();

        MonsterType reusedGoblin = MonsterFactory.getMonsterType("고블린", "goblin.png");
        System.out.println("캐시 확인: " + (goblinType == reusedGoblin));
    }
}
