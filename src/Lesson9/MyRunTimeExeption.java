package Lesson9;

public class MyRunTimeExeption extends RuntimeException {
    private int number;

    public int getNumber() {
        return number;
    }

    public MyRunTimeExeption(String message, int number) {
        super(message);
        this.number = number;
    }
}
