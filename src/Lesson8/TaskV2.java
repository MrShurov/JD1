package Lesson8;

import java.util.*;

public class TaskV2 {

    public static void main(String[] args) {
        boolean t = true;
        int s = 0;
        Map<String, String> a = new HashMap<>();
        a.put("Marty", "Perkin");
        a.put("Stuart", "Reges");
        a.put("Jessica", "Miller");
        a.put("Bruce", "R");
        a.put("Hal", "Perkin");
        String[] str = new String[a.size()];
        for (String key : a.keySet()) {
            str[s] = key;
            s++;
        }
        for (String key : a.keySet()){
            for(int i = 0;i < a.size();i++){
                if(!(key.equals(str[i])) && (a.get(key).equals(a.get(str[i])))){
                    t = false;
                }
            }
        }
        System.out.println(t);
    }

    private static void isUnique(Map a) {
    }
}


