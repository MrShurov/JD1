package Lesson9;

import org.apache.log4j.Logger;

public class Task5 {
    private static final Logger log = Logger.getLogger(Task5.class);

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            try {
                throw new MyExeption("Error!", -12);
            } catch(MyExeption ex){
                log.info(ex, e);
            }
        }
    }
}
