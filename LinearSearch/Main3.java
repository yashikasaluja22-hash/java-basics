import java.util.ArrayList;
import java.util.List;

public class Main3 {
    static abstract class Shape3 {
        abstract double area();
    }

    static class Circle extends Shape3 {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle extends Shape3 {
        double length;
        double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double area() {
            return length * width;
        }
    }

    public static void main(String[] args) {

            List<Shape3> shapes = new ArrayList<>();

            shapes.add(new Circle(5));
            shapes.add(new Rectangle(4, 6));
            shapes.add(new Circle(3));
            shapes.add(new Rectangle(2, 8));

            for (Shape3 s : shapes) {
                System.out.println(s.area());
            }
    }

}