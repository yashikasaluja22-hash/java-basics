import java.util.Scanner;
public class Conditionals2 {
    public static void main(String[] args){
        //Print numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }

        //OR
        int num = 1;
        do{
            System.out.print(num + " ");
            num++;
        }while(num <= 5);
    }
}
