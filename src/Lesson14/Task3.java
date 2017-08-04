package Lesson14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("qwerty", 12);
        map.put("qwertyu", 10);
        map.put("zxcv", 56);
        map.put("kg", 32);
        ArrayList<String> keys = new ArrayList<>();
        ArrayList<String> keysLess7 = new ArrayList<>();
        ArrayList<Integer> value = new ArrayList<>();
        keys.addAll(map.keySet());
        keys
                .stream()
                .filter((String str) -> str.length() < 7)
                .forEach(keysLess7::add);
        for (String aKeysLess7 : keysLess7) {
            value.add(map.get(aKeysLess7));
        }
        value
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);
    }
}

