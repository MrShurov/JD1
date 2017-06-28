package Lesson6;

import Lesson6.CompareSquare;

public class Demo{

    public static void main(String[] args) {
        CompareSquare cs = new CompareSquare();
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(2, 8);
        Square square = new Square(4);
        System.out.println(circle.toString());
        System.out.println(triangle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        cs.Compare(circle, triangle);
        cs.Compare(square, rectangle);
    }
}
