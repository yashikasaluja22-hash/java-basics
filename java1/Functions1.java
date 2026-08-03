import java.util.Scanner;
public class Functions1 {
    public static void main(String[] args) {
        sum();//calling function
        sum();//call it as many times u want

        int ans = sum2(); //sum2() function is returning an integer value so can be stored in int variable

        int ans2 = sum3(30, 40);
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("SUM: " + (a+b));
    }

    static int sum2(){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int sum = a+b;
     return sum;
    }

    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }

}
