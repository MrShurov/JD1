package Lesson12;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

public class NoteBook extends Computer implements Serializable {
    boolean touchPad;
    transient String localLanguage;

    NoteBook(String hardDrive, String ram, String videoCard, String cpu, boolean touchPad, String localLanguage) {
        super(hardDrive, ram, videoCard, cpu);
        this.touchPad = touchPad;
        this.localLanguage = localLanguage;
    }

    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook("HDD 1000 GB", "8 GB", "NVIDIA GeForce GTX 1050 Ti", "Intel Core i7", true, "English");
        try {
            FileOutputStream out = new FileOutputStream("src" + File.separator + "Lesson12" + File.separator + "TestNoteBook.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(noteBook);
            out.close();
            oos.close();
            FileInputStream in = new FileInputStream("src" + File.separator + "Lesson12" + File.separator + "TestNoteBook.tmp");
            ObjectInputStream ois = new ObjectInputStream(in);
            NoteBook noteBook1 = (NoteBook) ois.readObject();
            in.close();
            ois.close();
            System.out.println("HardDrive: " + noteBook1.hardDrive + " RAM: " + noteBook1.ram + " VideoCard: " + noteBook1.videoCard + " CPU: "
                    + noteBook1.cpu + " TouchPad: " + noteBook1.touchPad + " Local Language: " + noteBook1.localLanguage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
