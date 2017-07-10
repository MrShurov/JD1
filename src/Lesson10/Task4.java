package Lesson10;

public class Task4 {

    public static void main(String[] args){
        fio("Rydy","Petr","Ivanovich");
    }

    public static void fio(String str, String str2, String str3){
        str = str.toUpperCase();
        str2 = str2.toUpperCase();
        str3 = str3.toUpperCase();
        char f = str.charAt(0);
        char i = str2.charAt(0);
        char o = str3.charAt(0);
        System.out.println(f + "." + i + "." + o);
    }
}
