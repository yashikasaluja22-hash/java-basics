import java.util.Scanner;
public class Functions2 {
    public static void main(String[] args) {
        String message = greeting();
        System.out.println(message);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();

        String message2 = greeting2(name);
        //String message2 = greeting2("yashika saluja");
        System.out.println(message2);
    }
    static String greeting(){
        String greeting = "Hello World!";
        return greeting;
    }

    static String greeting2(String name){
        String greeting = "Hello " + name;
        return greeting;
    }
}
