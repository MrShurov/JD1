package Lesson8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class TaskV1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(7);
        a.add(3);
        a.add(-1);
        a.add(2);
        a.add(3);
        a.add(7);
        a.add(2);
        a.add(15);
        a.add(15);
        System.out.println("Количество не повторяющихся элементов " + countNotRepeated(a));
        System.out.println("Количество уникальных элементов " + countUnique(a));
    }

    private static int countNotRepeated(ArrayList a) {
        int d = 0;
        int counter = 0;
        if (a.isEmpty()) {
            return 0;
        } else {
            for (int i = 0; i < a.size(); i++) {
                d = Collections.frequency(a, a.get(i));
                if (d == 1) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static int countUnique(ArrayList a) {
        if (a.isEmpty()) {
            return 0;
        } else {
            HashSet<Integer> integerHashSet = new HashSet<>(a);
            return integerHashSet.size();
        }
    }
}
