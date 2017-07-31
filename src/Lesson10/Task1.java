package Lesson10;

public class Task1 {


    public static void main(String[] args){
        String str = "Demo";
        addStringPlus(str);
        addStringBuilder(str);
    }

    public static void addStringPlus(String str){
        long start = start();
        String result = "";
        for(int i = 0; i < 100; i++){
            result = result + str;
        }
        finish(start);
    }

    public static void addStringBuilder(String str){
        long start = start();
        StringBuilder strBuilder = new StringBuilder(str);
        for(int i = 0; i < 100; i++) {
            strBuilder.append(str);
        }
        finish(start);
    }

    public static long start(){
        long start = System.currentTimeMillis();
        return start;
    }

    public static void finish(long start){
        long finish = System.currentTimeMillis();
        long timeResult = finish - start;
        System.out.println(timeResult);
    }
}
