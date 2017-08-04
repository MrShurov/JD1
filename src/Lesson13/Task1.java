package Lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void main(String[] args){
        String srt = "shurov13@mail.ru";
        Pattern pattern = Pattern.compile("^[a-zA-z]+[a-zA-Z0-9_]*@[a-z]+\\.[a-z]{2,6}$");
        Matcher matcher = pattern.matcher(srt);
        if (matcher.find()){
            System.out.println("Эта строка e-mail: " + srt);
        } else {
            System.out.println("Это не e-mail: " + srt);
        }
    }
}
