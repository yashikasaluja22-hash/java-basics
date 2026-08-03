import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //to exit calc user will enter x or X
        while(true){
            int ans = 0;
            System.out.println("Enter an operator: ");
            char op = sc.next().charAt(0);
            if(op == 'x' || op == 'X') break;
            if(op == '+' || op == '-' || op == '/' || op == '*' || op == '%'){
                System.out.println("Enter 2 numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(op == '+'){
                    ans = num1 + num2;
                }
                else if(op == '-'){
                    ans = num1 - num2;
                }else if(op == '*'){
                    ans = num1 * num2;
                }else if(op == '/'){
                    ans = num1 / num2;
                }else if(op == '%'){
                    ans = num1 % num2;
               // }else if(op == 'x' || op == 'X'){
                //    break; here we cant write break because the parent if here becomes false so it not exceutes the inside break code
                }else{
                    System.out.println("Invalid input");
                }
            }
            System.out.println(ans);
        }
        System.out.println("You exited");
    }
}
