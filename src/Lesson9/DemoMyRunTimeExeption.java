package Lesson9;

import org.apache.log4j.Logger;

public class DemoMyRunTimeExeption {
    private static final Logger log = Logger.getLogger(DemoMyRunTimeExeption.class);

    public static void main(String[] args){

        try {
            getSummaNegativeNumbers(12);
        } catch(MyRunTimeExeption e){
            System.out.println();
            log.info("Error",e);

        }
    }

    public static int getSummaNegativeNumbers(int num) throws MyRunTimeExeption {
        int result = 0;
        if (num > 0) throw new MyRunTimeExeption("Число не может быть больше 0", num);
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }
}
