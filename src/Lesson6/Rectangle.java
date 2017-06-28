package Lesson6;

public class Rectangle implements Figure {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB(){
        return b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getSquare() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return a * 2 + b * 2;
    }

    public double getDiagonal() {
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public String toString(){
        return "Это " + getName() + " с сторанами " + getA() + " " + getB() + " Площадь: " + getSquare() + " Периметр: " + getPerimeter() + " Диагональ: " + getDiagonal();
    }
}
