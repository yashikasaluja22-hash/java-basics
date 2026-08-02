import  java.util.Scanner;
public class Trim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());
        //see the difference in output of line 5 & 7, use spaces in both
        System.out.println(sc.nextLine().trim());

    }
}/* sc.next() does not need trim() function cuz it
next() already removes leading and trailing spaces and reads only one word (until it finds whitespace)

but if u wanna use trim() then use it with sc.nextLine()
*/