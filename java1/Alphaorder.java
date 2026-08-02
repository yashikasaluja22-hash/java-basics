import java.util.Scanner;
public class Alphaorder {
    //to check character is in lower or upper case
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
    }
}
