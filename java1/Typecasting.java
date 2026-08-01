import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args) {
        //Typecasting : One datatyp is converted into another maybe automatically
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.print(num);
    }
}
//here if u will integer input for FLOAT then it will accept & convert it to automatically float
//when will this happen?
//1. both things should be compactible (like u cant give string and expect to convert to float)
//2. destination datatype shud be greater than the input/given datatype
//like here destination was float & float is greater than integer

//so float input can never be converted to integer, it will show error
