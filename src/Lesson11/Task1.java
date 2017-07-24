package Lesson11;

import java.io.*;

public class Task1 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src" + File.separator + "Lesson11" + File.separator + "TestTask1.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
