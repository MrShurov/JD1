package Lesson12;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer implements Serializable{
    String hardDrive;
    String ram;
    String videoCard;
    String cpu;

    public static void main(String[] args){
        Computer computer = new Computer("KINGSTON SKC300S37A60G", "8 GB", "NVIDIA GeForce GTX 760", "Intel(R) Cote(TM) i5-4440 CPU @ 3.10GHz");
        try {
            FileOutputStream out = new FileOutputStream("src" + File.separator + "Lesson12" + File.separator + "TestComputer.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(computer);
            out.close();
            oos.close();
            FileInputStream in = new FileInputStream("src" + File.separator + "Lesson12" + File.separator + "TestComputer.tmp");
            ObjectInputStream ois = new ObjectInputStream(in);
            Computer computer1 = (Computer) ois.readObject();
            in.close();
            ois.close();
            System.out.println("HardDrive: " + computer1.hardDrive + " RAM: " + computer1.ram + " VideoCard: " + computer1.videoCard + " CPU: " + computer1.cpu);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
