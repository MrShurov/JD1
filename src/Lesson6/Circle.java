package Lesson6;

public class Circle implements Figure {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
}

    public double getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    @Override
    public String toString(){
        return "Это " + getName() + " с радиусом " + getRadius() + " Площадь: " + getSquare() + " Периметр: " + getPerimeter() + " Диаметр: " + getDiameter();
    }
}
