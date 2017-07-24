package Lesson11;

import java.io.*;

public class Task7 {

    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new FileReader("src" + File.separator + "Lesson11" + File.separator + "Task1.java"));
            StringBuilder sb = new StringBuilder();
            Writer writer = new FileWriter("src" + File.separator + "Lesson11" + File.separator + "OutPut.txt");
            String str;
            while ((str = br.readLine()) != null) {
                sb.append(str + "\n");

            }
            sb.reverse();
            writer.write(sb.toString());
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
