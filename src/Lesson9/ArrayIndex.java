package Lesson9;

import org.apache.log4j.Logger;

public class ArrayIndex {
    private static final Logger log = Logger.getLogger(ArrayIndex.class);

    public static void main(String[] args){
        int[] array = new int[10];
        try{
            array[11] = 12;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error!");
            log.info("Ошибка", e);
        }
    }
}
