package Lesson6;

public class Square implements Figure{
    private double x;

    public double getX() {
        return x;
    }

    public Square(double x) {
        this.x = x;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getSquare() {
        return x * x;
    }

    @Override
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
