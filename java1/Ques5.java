import java.util.Scanner;
public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ss =  sc.nextLine();
        for(int i = 0; i < ss.length(); i++){
            char ch = ss.charAt(i);
            if(Character.isUpperCase(ch)) {
                System.out.println(ch);
            }
        }
    }
}

