package Lesson11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Task3 {

    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new FileReader("src" + File.separator + "Lesson11" + File.separator + "TestTask1.txt"));
            StringBuilder sb = new StringBuilder();
            String str;
            while ((str = br.readLine()) != null) {
                sb.append(str);
            }
            br.close();
            String[] words = sb.toString().split("\\s*(\\s|,|!|\\.)\\s*");
            for (int i = 0; i < words.length - 1; i++) {
                   if (words[i].charAt(words[i].length() - 1) == words[i + 1].charAt(0)) {
                        System.out.println(words[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
