package Lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

    public static void main(String[] args){
        String str = "272.16.0.0";
        Pattern pattern = Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()){
            System.out.println("Это IPv4: " + str);
        } else{
            System.out.println("Это не IPv4: " + str);
        }
    }
}
