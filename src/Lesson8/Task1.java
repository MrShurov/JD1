package Lesson8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Task1 {

    public static void main(String[] args) {
        int mark = 0;
        int counter = 0;
        int highest = 0;
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            mark = 1 + (int) (Math.random() * 10);
            marks.add(mark);
        }
        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i) < 6) {
                marks.remove(i);
                i--;
            }
        }
        Iterator<Integer> iterator = marks.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (int i = 0; i < marks.size(); i++){
            if(highest < marks.get(i)){
                highest = marks.get(i);
            }
        }
        System.out.println("Самая высокая оценка: " + highest);
    }
}
