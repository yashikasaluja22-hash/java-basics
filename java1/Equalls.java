import java.util.Scanner;
public class Equalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        if(fruit.equals("mango")){
            System.out.println("king of fruits");
        }
        if(fruit.equals("apple")){
            System.out.println("Keeps Doctor away");
        }
    }
}
/*here fruit.equals("mango); is actually equal to --> fruit == "mango";
*/

//SWITCH CASE