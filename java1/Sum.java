import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("SUM OF INTEGERS:" +  " ");
        System.out.println(a+b);
        System.out.print("DIFFERENCE OF INTEGERS:" +  " ");
        System.out.println(a-b);
        System.out.print("MULTIPLICATION OF INTEGERS:" +  " ");
        System.out.println(a*b);
        System.out.print("QUOTIENT OF INTEGERS:" +  " ");
        System.out.println(a/b);
        System.out.print("REMAINDER OF INTEGERS:" +  " ");
        System.out.println(a%b);
    }
}
