package Lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            a.add(-50 + (int) (Math.random() * 100));
        }
        bubbleSort(a);
        for (int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
    }

    static void bubbleSort(ArrayList<Integer> a) {
        for (int i = a.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a.get(j) < a.get(j + 1)) {
                    int t = a.get(j);
                    int y = a.get(j + 1);
                    a.set(j, y);
                    a.set(j + 1, t);
                }
            }
        }
    }
}
