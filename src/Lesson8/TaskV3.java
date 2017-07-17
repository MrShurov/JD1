package Lesson8;

import java.util.HashMap;
import java.util.Map;

public class TaskV3 {

    public static void main(String[] args){
        Map<Integer, String> a = new HashMap<>();
        a.put(6, "a");
        a.put(4, "b");
        a.put(3, "c");
        a.put(1, "d");
        //a.put(0, "8");
        for (Integer key : a.keySet()){
            System.out.print(a.get(key) + "x^" + key + " + ");
        }
        System.out.print(8);
    }
}
