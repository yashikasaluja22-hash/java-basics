import java.util.Scanner;
public class Countoccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count  = 0;
        //here we are coutning occurances of 5 in a input number
        while(n > 0){
            int rem = n % 10;
            if(rem == 5) count++;
            n /= 10;
        }
        System.out.println(count);
    }
}
