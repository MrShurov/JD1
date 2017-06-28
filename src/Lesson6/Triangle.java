package Lesson6;

public class Triangle implements Figure {
    private double a;
    private double b;
    private double c;
    private double heightA;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getSquare() {
        return Math.sqrt((getPerimeter() * (getPerimeter() - a) * (getPerimeter() - b) * (getPerimeter() - c)));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public double getHeightA(){
        return 2 * getSquare() / b;
    }

    public double getHeightB(){
        return 2 * getSquare() / b;
    }

    public double getHeightC(){
        return 2 * getSquare() / c;
    }

    @Override
    public String toString(){
        return "Это " + getName() + " с сторанами " + getA() + " " + getB() + " " + getC() + " Площадь: " + getSquare() + " Периметр: " + getPerimeter() + " Высота А: " + getHeightA() + " Высота B: "
                + getHeightB() + " Высота C: " + getHeightC();
    }
}
