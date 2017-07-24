package Lesson11;

import java.io.*;

public class Task5 {

    public static void main(String[] args){
        int averageValue = 0;
        FileOutputStream dataFile = null;
        try {
            dataFile = new FileOutputStream("src" + File.separator + "Lesson11" + File.separator + "Data.txt");
            byte[] a = new byte[20];
            int readedIn = 0;
            for (int i = 0; i < 20; i++) {
                a[i] = (byte) (Math.random() * 254);
                dataFile.write(a[i]);
            }
            ByteArrayInputStream in = new ByteArrayInputStream(a);
            for (int i = 0; i < 20; i++){
                readedIn = in.read();
                System.out.print(readedIn + " ");
                averageValue += readedIn;
            }
            averageValue = averageValue / 20;
            System.out.println("\nСреднее арифметическое: " + averageValue);
            in.close();
            dataFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
