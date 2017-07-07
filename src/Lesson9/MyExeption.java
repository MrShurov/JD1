package Lesson9;

public class MyExeption extends Exception {
    private int number;

    public int getNumber() {
        return number;
    }

    public MyExeption(String message, int number) {
        super(message);
        this.number = number;
    }
}
