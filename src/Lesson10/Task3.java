package Lesson10;

public class Task3 {
    public static void main(String[] args) {
        check("Demo dsaf gfds Demo", "Demo");
    }

    public static boolean check(String str, String str2) {
        boolean isStartAndFinish = false;
        str = str.toLowerCase();
        str2 = str2.toLowerCase();
        int a = str.indexOf(str2);
        int b = str.lastIndexOf(str2);
        if(a == 0 && b == (str.length() - 1 ) - (str2.length() - 1)){
            isStartAndFinish = true;
            System.out.println("Строка начитается и заканчивается с слова " + str2);
        }
        return isStartAndFinish;
    }
}
