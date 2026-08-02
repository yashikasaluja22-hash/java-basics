import java.util.Scanner;
public class Tempconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("is ur temp in Celsius(C) or Fahrenheit(F)? ");
        char degree = sc.next().charAt(0);
        if(degree == 'C'){
            System.out.println("Type ur temp in Celsius");
            double temp = sc.nextInt();
            double Conversion = (temp * (9/5)) + 32;
            System.out.println(Conversion);
        }else{
            System.out.println("Type ur temp in Fahrenheit(F)? ");
            double temp = sc.nextInt();
            double Converison = (temp - 32)*(5/9);
            System.out.println(Converison);
        }
    }
}
