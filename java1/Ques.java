import java.util.Scanner;
public class Ques {
    //to print every character of string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine();
        for(int i = 0; i < ss.length(); i++){
            System.out.print(ss.charAt(i));
        }
    }
}
