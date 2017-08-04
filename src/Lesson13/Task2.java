package Lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static void main(String[] args){
        String str = "0x6F Итак, шестнадцатеричная система счисления, как следует из названия, имеет в своём основании число 16. 0x2F В Си и языках схожего синтаксиса, например, в Java, используют префикс 0x. Например, 0x5A3";
        Pattern pattern = Pattern.compile("0x[0-9A-F]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println("Шестнадцатеричное число: " + matcher.group());
        }
    }
}