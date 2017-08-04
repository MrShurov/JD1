package Lesson13;

import java.util.regex.Pattern;

public class Task3 {

    public static void main(String[] args){
        String str = "<body>\n <h1>Заголовок</h1>\n <p id = \"1d\">Первый абзац.</p>\n <p id =\"p1\">Второй абзац.</p>\n</body>";
        str = Pattern.compile("<p[^>]*>").matcher(str).replaceAll("<p>");
        System.out.println(str);
    }
}
