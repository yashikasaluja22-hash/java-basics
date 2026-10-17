public class Main5 {
    interface Flyable {
        void fly();
    }

    interface Swimmable {
        void swim();
    }

    static class Duck implements Flyable, Swimmable {
        public void fly() {
            System.out.println("Duck is flying");
        }

        public void swim() {
            System.out.println("Duck is swimming");
        }
    }

        public static void main(String[] args) {
            Duck d = new Duck();
            d.fly();
            d.swim();
        }
}

