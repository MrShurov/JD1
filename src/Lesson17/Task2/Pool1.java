package Lesson17.Task2;

import static Lesson17.Task2.TimeCounter.finish;
import static Lesson17.Task2.TimeCounter.start;

public class Pool1 {
    public static void main(String[] args) {
        long start = 0;
        int max = 0;
        int capacityOfArray = 100;//(int) (Math.random() * 1000000);
        int[] array = new int[capacityOfArray];
        int randomAmount = 0;
        for (int i = 0; i < array.length; i++) {
            randomAmount = (int) (Math.random() * 301);
            array[i] = randomAmount;
        }
        start = start();
        max = max(array);
        System.out.println("Время получения максимального элемента " + finish(start));
        System.out.println("Количество элементов массива " + capacityOfArray);
        System.out.println("Максимальный элемент массива " + array[max]);
    }

    static int max(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[j] < array[i]) {
                j = i;
            }
        }
        return j;
    }
}
