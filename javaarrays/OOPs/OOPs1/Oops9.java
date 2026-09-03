public class Oops9 {
    //this is a demo for intialisation of static variables
    //run the code and observe
    static int a = 4;
    static int b;

    //this static method will run only once when first object is createdd i.e. when the class is loaded for first time
    static {
        System.out.println("i m Static block");
        b = a * 5;
    }

    public static void main(String[] args){
        Oops9 obj1 = new Oops9();
        System.out.println(Oops9.a + " " + Oops9.b);

        b += 3;
        System.out.println(Oops9.a + " " + Oops9.b);

        Oops9 obj2 = new Oops9();
        System.out.println(Oops9.a + " " + Oops9.b);
    }

}
