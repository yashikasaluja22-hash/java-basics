import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        int digit = n;
        while(digit > 0){
            reverse = (reverse*10)+(digit%10);
            digit /= 10;
        }
        System.out.println(reverse);
    }
}
