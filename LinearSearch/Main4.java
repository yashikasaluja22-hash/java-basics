public class Main4 {
    interface Drawable{
        void draw();
    }
    static class Circle implements Drawable{
        @Override
        public void draw(){
            System.out.println("Drawing a Circle");
        }
    }
    static class Rectangle implements Drawable{
        @Override
        public void draw(){
            System.out.println("Drawing a Rectangle");
        }
    }
        public static void main(String[] args) {

            Drawable d;

            d = new Circle();
            d.draw();

            d = new Rectangle();
            d.draw();
        }
}
