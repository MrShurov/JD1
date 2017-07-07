package Lesson9;

import org.apache.log4j.Logger;

public class Task7 {
    private static final Logger log = Logger.getLogger(Task7.class);

    public static void main(String[] args) {
        int a = 0;
        a = 1 + (int) (Math.random() * 2);
        try {
            Test(a);
        } catch (NullPointerException e) {
            log.info(e);
            System.out.println("Ошибка! " + e);
        } finally {
            System.out.println("Testing finally");
        }
    }

    public static void Test(int a) {
        if (a == 1) {
            throw new NullPointerException();
        } else {
            System.out.println("Все хорошо");
        }
    }
}
