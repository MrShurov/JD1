package Lesson15;

import java.util.Stack;

import static Lesson15.Factory.randomAmount;
import static Lesson15.Factory.throwDetails;


public class Dump {

    public static void main(String[] args) {
        Stack<Details> dumpDetails = new Stack<>();
        for (int i = 0; i < 20; i++) {
            throwDetails(dumpDetails);
        }
        Scientist madScientistFirst = new Scientist("Egor");
        Scientist madScientistSecond = new Scientist("Andrey");
        new Thread(() -> {
            System.out.println("Первый прислужник ушел");
            for (int i = 1; i <= 100; i++) {
                createThread(dumpDetails, madScientistFirst);
            }
            System.out.println(madScientistFirst.scientistName + " собрал " + madScientistFirst.amountRobots + " роботов");
        }).start();
        new Thread(() -> {
            System.out.println("Второй прислужник ушел");
            for (int i = 1; i <= 100; i++) {
                createThread(dumpDetails, madScientistSecond);
            }
            System.out.println(madScientistSecond.scientistName + " собрал " + madScientistSecond.amountRobots + " роботов");
        }).start();
        int nightCounter = 0;
        for (int i = 1; i <= 100; i++) {
            int counter = 0;
            int randomAmount = randomAmount();
            while (counter <= randomAmount) {
                throwDetails(dumpDetails);
                counter++;
            }
            nightCounter++;
            System.out.println("Закончилась " + nightCounter + " ночь");
            try {
                Thread.sleep(99);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private static void createThread(Stack<Details> dumpDetails, Scientist madScientist) {
        try {
            Details test = null;
            int counter = 0;
            int randomAmount = randomAmount();
            while (counter <= randomAmount){
                test = madScientist.getDetails(dumpDetails);
                madScientist.countDetail(test);
                if(test.equals(Details.NOTHING)){
                    break;
                }
                counter++;
            }
            madScientist.createRobot();
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
