package Lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

    public static void main(String[] args) {
        String str = "Hello +375294567328 справочную информацию о предприятиях (сфера деятельности и пр. +375443272836) +375447456788";
        String[] telephone = new String[amountNumbersPhone(str)];
        Pattern pattern = Pattern.compile("\\+375(29|44|33|25)[0-9]{7}");
        Matcher matcher1 = pattern.matcher(str);
        String[] parts = pattern.split(str);
        numbersPhone(matcher1,telephone);
        convert(parts, telephone);
        out(parts);
    }

    private static int amountNumbersPhone(String str){
        int counter = 0;
        Pattern pattern = Pattern.compile("\\+375(29|44|33|25)[0-9]{7}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            counter++;
        }
        return counter;
    }

    private static void numbersPhone(Matcher matcher,String[] telephone){
        int counter = 0;
        while (matcher.find()){
            String str3 = matcher.group();
            telephone[counter] = str3;
            counter++;
        }
    }

    private static void convert(String[] parts, String[] telephone ){
        String str2 = "";
        String str1 = "";
        char[] ch;
        for (int q = 0; q < parts.length; q++) {
            str2 = parts[q] + telephone[q];
            Pattern pattern2 = Pattern.compile("\\+375(29|44|33|25)[0-9]{7}");
            Matcher matcher = pattern2.matcher(str2);
            while (matcher.find()) {
                str1 = matcher.group();
                ch = new char[str1.length()];
                for (int i = 0; i < str1.length(); i++) {
                    ch[i] = str1.charAt(i);
                }
                str1 = "+375(" + ch[4] + ch[5] + ")" + ch[6] + ch[7] + ch[8] + "-" + ch[9] + ch[10] + "-" + ch[11] + ch[12];
                parts[q] = matcher.replaceAll(str1);
            }
        }
    }

    private static void out(String[] parts){
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            sb.append(part);
        }
        System.out.println(sb.toString());
    }
}
