package Lesson11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new FileReader("src" + File.separator + "Lesson11" + File.separator + "TestTask1.txt"));
            String str;
            while ((str = br.readLine()) != null) {
                int i = 0;
                String str1 = "Отсутствуют цифры";
                Pattern pat = Pattern.compile("[0-9]+");
                Matcher matcher=pat.matcher(str);
                while (matcher.find()) {
                    if(matcher.group().length() > i){
                     i = matcher.group().length();
                     str1 = matcher.group();
                    }
                }
                System.out.println(str1);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
