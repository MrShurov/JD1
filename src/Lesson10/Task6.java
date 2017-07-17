package Lesson10;

public class Task6 {
    public static void main(String[] args){
        String str = "aaabbcdeef";
        replacement(str);
    }

    public static void replacement(String str){
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == str.charAt(i + 1)){
                char a = str.charAt(i);
                str = str.replace(a,' ');
            }
        }
        System.out.println(str);
    }

}
