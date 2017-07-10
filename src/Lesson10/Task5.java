package Lesson10;

public class Task5 {

    public static void main(String[] args) {
        int wordCount = 0;
        String str = "Форвард  Манчестер Юнайтед Антони 32  Марсиаль может  перебраться в Италию.";
        String[] words = str.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (!"".equals(words[i])) {
                ++wordCount;
            }
        }
        System.out.println(wordCount);
    }
}

