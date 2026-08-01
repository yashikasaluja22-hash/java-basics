import java.util.Scanner;
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ss = sc.next();
        String hi = "";
        for(int i = ss.length() - 1; i >= 0; i--){
            hi += ss.charAt(i);
        }
        System.out.println(hi);
    }
}
