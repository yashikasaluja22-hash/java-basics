import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(checkArmstrong(n));
    }
    //check if input number is armstrong no. or not
    static boolean checkArmstrong(int n) {
        int a = n;
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            sum += Math.pow(rem, 3);
            a /= 10;
        }
        if (sum == n) {
            return true;
        }
        return false;
    }
}
