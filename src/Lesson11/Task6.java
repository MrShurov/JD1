package Lesson11;

import java.io.File;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь нужного каталога");
        String str = in.nextLine();
        File myDir = new File(str);
        if(myDir.exists() && myDir.isDirectory()){
            File[] files = myDir.listFiles();
            for(int i = 0; i < files.length; i++){
                System.out.println(files[i].getName());
            }
        } else{
            System.out.println("Нету данного каталога");
        }
    }
}
