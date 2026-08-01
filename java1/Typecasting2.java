import java.util.Scanner;
public class Typecasting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)67.58f;
        //This is TYPECASTING
        //now num will take the integer value of 67.58
        System.out.println(num);

        byte a = 34;
        System.out.println(a);
        /*
         now byte variable has only 256 unique values or can store upto 256 numbers only
         it has memory of 1 byte = 8 bits, used to store very small numbers;
         so if u save 257 or larger no. as a byte value then it will remainder
        */

        int a1 = 257;
        byte b = (byte)a; // 257 % 256 = 1
        System.out.println(b);

        //another example of Typecasting
        int hi = 'A';
        System.out.println(hi);
        //will convert 'A' to ASCII value

        System.out.println(3 * 6.17);//will give output in float (typecasting)

        // SHORT dtatype: used to store small inetegers upto 32,768 , memmory = 2 bytes

    }
}
