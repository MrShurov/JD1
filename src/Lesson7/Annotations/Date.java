package Lesson7.Annotations;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.ToString;



import java.util.Scanner;
@ToString
public class Date {
    public int day;
    private int month;
    protected int year;
    private double time;

    Date(int day, double time){
        this.day = day;
        time = time;
    }

    @Ignore
    Date(int day,int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Transaction
    public static void main(String[] args) {
    }

    @Deprecated
    public void Test1(){

    }

    private static void dateOut(int Day, int Month, int Year){
        System.out.println(Day + "." + Month + "." + Year);
    }
}
