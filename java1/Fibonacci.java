import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    int count = 2;//index at which we r in the sequence of fibonacci no.
    while(count <= n){
        int temp = b;
         b = a + b;
         a = temp;
         count++;
    }
    System.out.println(b);
    }
}
