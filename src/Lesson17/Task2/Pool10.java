package Lesson17.Task2;

import java.util.concurrent.*;

import static Lesson17.Task2.TimeCounter.finish;
import static Lesson17.Task2.TimeCounter.start;

public class Pool10 {

    private static int counter;
    private static int j;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start = 0;
        int max = 0;
        int capacityOfArray = 100;//(int) (Math.random() * 1000000);
        int[] array = new int[capacityOfArray];
        int randomAmount = 0;
        for (int i = 0; i < array.length; i++) {
            randomAmount = (int) (Math.random() * 301);
            array[i] = randomAmount;
        }
        ExecutorService service = Executors.newFixedThreadPool(10);
        start = start();
        for (int i = 0; i < 10; i++) {
            service.submit(new Runnable() {
                public void run() {
                    for (counter = 0; counter < array.length; counter++) {
                        if (array[j] < array[counter]) {
                            j = counter;
                        }
                    }
                }
            });
        }
        service.shutdown();
        System.out.println("Время получения максимального элемента " + finish(start));
        System.out.println("Количество элементов массива " + capacityOfArray);
        System.out.println("Максимальный элемент массива " + array[j]);
    }
}
