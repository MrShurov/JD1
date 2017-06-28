package Lesson6;

public class Demo extends CompareSquare{

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(2, 8);
        Square square = new Square(4);
        System.out.println(circle.toString());
        System.out.println(triangle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        CompareSquare(circle, triangle);
        CompareSquare(square, rectangle);
    }
}
