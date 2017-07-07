package Lesson9;

import org.apache.log4j.Logger;

public class DemoMyExeption {
    private static final Logger log = Logger.getLogger(DemoMyExeption.class);

    public static void main(String[] args){

        try {
            getSummaPossitiveNumbers(-12);
        } catch(MyExeption e){
            System.out.println();
            log.info("Error",e);

        }
    }

    public static int getSummaPossitiveNumbers(int num) throws MyExeption {
        int result = 0;
        if (num < 0) throw new MyExeption("Число не может быть меньше 0", num);
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }
}
