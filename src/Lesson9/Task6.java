package Lesson9;

import org.apache.log4j.Logger;

public class Task6 {
    private static final Logger log = Logger.getLogger(Task6.class);

    public static void main(String[] args) {
        int a = 0;
        a = 1 + (int) (Math.random() * 3);
        try {
            Test(a);
        } catch (NullPointerException e) {
            log.info(e);
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException e) {
            log.info(e);
            System.out.println(a);
        } catch (IndexOutOfBoundsException e) {
            log.info(e);
            System.out.println(a);
        }
    }

    public static void Test(int a) {
        if (a == 1) {
            throw new NullPointerException();
        } else if (a == 2) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (a == 3) {
            throw new IndexOutOfBoundsException();
        }
    }
}
