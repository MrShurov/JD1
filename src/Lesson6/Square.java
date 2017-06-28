package Lesson6;

public class Square implements Figure{
    private double x;

    public double getX() {
        return x;
    }

    public Square(double x) {
        this.x = x;
    }

    public String getName() {
        return "Square";
    }

    public double getSquare() {
        return x * x;
    }

    public double getPerimeter() {
        return x * 4;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * x;
    }

    @Override
    public String toString(){
        return "Это " + getName() + " с сторанами " + getX() + " Площадь: " + getSquare() + " Периметр: " + getPerimeter() + " Диагональ: " + getDiagonal();
    }
}
