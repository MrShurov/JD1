package Lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Task4 {

    public Map<String, Integer> findThrees(String str) {
        Map<String, Integer> dictionary = new HashMap<>();

        StringTokenizer tokenizer = new StringTokenizer(str, " .\t\n\r");
        while (tokenizer.hasMoreTokens()){
            int i = 0;
            String word = (String) tokenizer.nextElement();
            String str1 = word.substring(i);
            int z = (str + "\0").split(str1).length - 1;
            dictionary.put(str1, z);
            i++;
        }
        System.out.println(dictionary);
        return dictionary;
    }

    public static void main(String arg[]){
        Task4 dic = new Task4();
        dic.findThrees("4. Имеется текст. Следует составить для него частотный словарь. Привет Привет. 123 123 123");
    }
}
