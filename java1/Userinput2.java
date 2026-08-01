import java.util.Scanner;
public class Userinput2 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int amount = sc.nextInt();
            int people = sc.nextInt();
            if(people != 0){
                System.out.println(amount/people);
            }else{
                System.out.println(amount);
            }
        }
    }

