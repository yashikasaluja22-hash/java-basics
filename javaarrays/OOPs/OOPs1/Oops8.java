public class Oops8 {
    //here we call a static method inside a constructor using class name with it
    public void main(String[] args) {
     Human a = new Human("gumball", 22, true);
    }
 class Human{
        String name;
        int age;
        boolean married;
        static long population;

        static void message(){
            System.out.println("Hello World");
        }
            Human(String name, int age, boolean married){
                this.name = name;
                this.age = age;
                this.married = married;
                Human.message();
            }
    }
}