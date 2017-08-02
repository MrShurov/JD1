package Lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void main(String[] args){
        String srt = "shurov13@mail.ru";
        Pattern pattern = Pattern.compile("^[a-zA-z]");
        Matcher matcher = pattern.matcher(srt);
        if (matcher.find()){
            System.out.println("Эта строка E-mail: " + srt);
        }
    }
}
