package Lesson9;

import org.apache.log4j.Logger;

public class NullExeption {
    private static final Logger log = Logger.getLogger(NullExeption.class);

    public static void main(String[] args) {
        String a = null;
        String d = "test";
        try {
            a.equals(d);
        } catch (Exception e) {
            System.out.println("Ошибка!");
            log.info("Error!");
        }
    }
}
