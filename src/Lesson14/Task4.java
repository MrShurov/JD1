package Lesson14;

import java.util.ArrayList;

public class Task4 {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("Результирующая строка: ");
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.forEach(sb::append);
        System.out.println(sb.toString());
    }
}
