package Lesson8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder n = new StringBuilder();
        ArrayList<Integer> numbers = new ArrayList<>();
        int number = 0;
        System.out.println("Введите число: ");
        number = in.nextInt();
        while (number > 0){
            numbers.add(number%10);
            number = number / 10;
        }
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
