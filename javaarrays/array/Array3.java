import java.util.Scanner;
import java.util.Arrays;
public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        for(int i  = 0; i < str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
        //give output like thi --> hello aa bb cc ajsak

        //modify array
        str[0] = "Kunal";
        System.out.println(Arrays.toString(str));
    }
}
