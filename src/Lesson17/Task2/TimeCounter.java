package Lesson17.Task2;

public class TimeCounter {

    public static long start(){
        return System.currentTimeMillis();
    }

    public static long finish(long start){
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
