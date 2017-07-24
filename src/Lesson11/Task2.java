package Lesson11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Task2 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src" + File.separator + "Lesson11" + File.separator + "TestTask1.txt"));
            StringBuilder sb = new StringBuilder();
            String str;
            String letters = "уУеЕёЁаАоОэЭяЯиИюЮЫы";
            int q = 0;
            char[] ch = new char[letters.length()];
            for (char letter : letters.toCharArray()) {
                ch[q] = letter;
                q++;
            }
            while ((str = br.readLine()) != null) {
                sb.append(str);
            }
            br.close();
            String[] words = sb.toString().split("\\s*(\\s|,|!|\\.)\\s*");
                for (int i = 0; i < words.length; i++) {
                    for(int w = 0; w < ch.length; w++){
                        if (words[i].charAt(0) == ch[w]) {
                            System.out.println(words[i]);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
