package Lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task9 {


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> blackBox = new ArrayList<>();
        for (int i = 0;i < 10; i++){
            blackBox.add(i);
        }
        info(blackBox);
    }

    static void info(ArrayList a){
        Scanner in = new Scanner(System.in);
        int k = 0;
        int counter = 0;
        int counter2 = 0;
        System.out.println("1.Добавление нового элемента 2.Получение максимального элемента 3.Получение минимального элемента 4.Получение количества элементов");
        counter = in.nextInt();
        if(counter == 1){
            System.out.println("Введите новый элемент");
            int g = in.nextInt();
            a.add(g);
        }else if(counter == 2){
            System.out.println("Максимальный элемент: " + Collections.max(a));
        }else if(counter == 3){
            System.out.println("Минимальный элемент: " + Collections.min(a));
        }else if(counter == 4){
            k = a.size();
            System.out.println("Количество элементов: " + k);
        }
        System.out.println("0 - продолжить 1 - выйти");
        counter2 = in.nextInt();
        if (counter2 == 0){
            info(a);
        } else {
            System.exit(0);
        }
    }
}
