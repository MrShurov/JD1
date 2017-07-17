package Lesson8;

import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Task3 {

    public static void main(String[] args){
        TreeSet<String> students = new TreeSet<String>();
        students.add("A a");
        students.add("B b");
        students.add("C c");
        students.add("G g");
        students.add("V v");
        NavigableSet<String> navSet = students.descendingSet();
        System.out.println("Вариант 1: " + students.descendingSet());
        ArrayList<String> students2 = new ArrayList<>();
        students2.add("A a");
        students2.add("B b");
        students2.add("C c");
        students2.add("G g");
        students2.add("V v");
        int counter = students2.size() - 1;
        System.out.print("Вариант 2: ");
        for(int i = 0;i <students2.size(); i++){
            System.out.print(students2.get(counter) + ",");
            counter--;
        }
    }
}
