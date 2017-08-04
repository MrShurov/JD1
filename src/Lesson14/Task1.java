package Lesson14;


import java.util.ArrayList;


public class Task1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        list
                .stream()
                .mapToInt(Integer::intValue)
                .filter((p) -> p % 2 == 1 && p % 5 == 0 && p != 0)
                .average()
                .ifPresent(System.out::println);
    }
}
