class Shapes{
    void area(){
        System.out.println("i m in shapes");
    }
}
//this is heirarchical inheritance
class Circle extends Shapes{
    @Override //u can even remove this keyword, as it will be still be called internally
    void area(){
     System.out.println("i m in Circle");
    }
}
class Rectangle extends Shapes{
    void area(){
        System.out.println("i m in Rectangle");
    }
}
class Sqaure extends Shapes{
    void area(){
        System.out.println("i m in sqaure");
    }
}
public class inherit2 {
    public static void main(String[] args) {
        Shapes shape = new Shapes();//this will call the area() of Shapes class
        Circle circle = new Circle();//this will call the area() of Circle class
        Rectangle rectangle = new Rectangle();//this will call the area() of Rectangle class
        Sqaure sqaure = new Sqaure();

        Shapes square1 = new Sqaure();//internally child class override kar degi

        shape.area();
        circle.area();
        rectangle.area();
        square1.area();

        Shapes circle2 = new Circle();
        circle2.area();
    }
}
