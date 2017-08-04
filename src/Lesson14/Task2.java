package Lesson14;

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("qwerty");
        list.add("q1234567we");
        list.add("123456789e");
        list.add("q1234567we");
        list
                .stream()
                .distinct()
                .filter((String str) -> str.length() > 8 )
                .forEach(System.out::println);
    }
}
