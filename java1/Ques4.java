import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int reversed = 0;
        int digit = a;
        while(digit > 0){
            reversed = (reversed*10) + (digit % 10);
            digit = digit/10;
        }
        System.out.println(reversed);
    }
}
