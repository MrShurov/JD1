package Lesson12;

import java.io.*;

public class Task1 {

    public static void main(String[] args) {
        long time = 0L;
        String f = "Q";
        time = start();
        BufWriter(f);
        System.out.println("Время выполнения BufferedWriter " + finish(time));
        time = start();
        BufReader();
        System.out.println("Время выполнения BufferedReader " + finish(time));
        time = start();
        NotBufWriter(f);
        System.out.println("Время выполнения Writer " + finish(time));
        time = start();
        NotBufReader();
        System.out.println("Время выполнения Reader " + finish(time));
    }

    private static long start() {
        return System.currentTimeMillis();
    }

    private static long finish(long start) {
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private static void BufWriter(String f) {
        int counter = 0;
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("src" + File.separator + "Lesson12" + File.separator + "TestTask1.txt"));
            while (counter < 5242880) {
                out.write(f);
                counter++;
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void BufReader() {
        String tmp = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader("src" + File.separator + "Lesson12" + File.separator + "TestTask1.txt"));
            while ((tmp = in.readLine()) != null) {
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void NotBufWriter(String f) {
        int counter = 0;
        try {
            Writer writer = new FileWriter("src" + File.separator + "Lesson12" + File.separator + "Test1Task1.txt");
            while (counter < 5242880) {
                writer.write(f);
                counter++;
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void NotBufReader() {
        int tmp = 0;
        try {
            Reader reader = new FileReader("src" + File.separator + "Lesson12" + File.separator + "Test1Task1.txt");
            while ((tmp = reader.read()) >= 0) {
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}