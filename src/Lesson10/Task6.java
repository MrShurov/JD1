package Lesson10;

public class Task6 {
    public static void main(String[] args){
        String str = "aaabbcdeef ttt";
        replacement(str);
    }

    private static void replacement(String str){
        char[] strChar = str.toCharArray();
        int counter = 0;
        int counterStr = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if(strChar[i] == strChar[i + 1]){
                strChar[i] = '^';
                counterStr++;
            }
        }
        counterStr = str.length() - counterStr;
        char[] newStr = new char[counterStr];
        for(int i = 0; i < str.length(); i++) {
            if (strChar[i] != '^'){
                newStr[counter] = strChar[i];
                counter++;
            }
        }
        str = String.copyValueOf(newStr);
        System.out.println(str);
    }

}
