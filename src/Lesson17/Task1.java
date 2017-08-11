package Lesson17;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task1 {

    public static void main(String[] args) {
            ExecutorService service = Executors.newSingleThreadExecutor();
            Scanner in = new Scanner(System.in);
            long number = 0;
            do {
                number = in.nextLong();
                long finalNumber = number;
                service.submit(new Runnable() {
                    public void run() {
                        inNumber(finalNumber);
                    }
                });
            } while (number != -1);
            service.shutdown();
    }

    private static void inNumber(long number){
        long ms;
        ms = number * 1000;
        try {
            Thread.sleep(number * 1000);
            System.out.println("Я спал " + number + " секунд");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
