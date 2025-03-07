package me.whiteship.designpatterns._02_structural_patterns._11_flyweight._02_after;

import java.util.HashMap;
import java.util.Map;

public class MonsterFactory {

    private static final Map<String, MonsterType> monsterCache = new HashMap<>();

    public static MonsterType getMonsterType(String name, String texture) {
        if (!monsterCache.containsKey(name)) {
            monsterCache.put(name, new MonsterType(name, texture));
        }

        return monsterCache.get(name);
    }
}
