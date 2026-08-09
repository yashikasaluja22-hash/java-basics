public class EvenDigits2 {
    public static void main(String[] args){
        //this is ques is optimised here
     System.out.println(NumberOfDigits(0));
        System.out.println(EvenDigits(0));
    }
    static int NumberOfDigits(int n){
        if(n < 0){
            n = n * -1;
        }
        return (int)Math.log10(n) + 1;
    }
    static boolean EvenDigits(int n){
        int Evendigits = NumberOfDigits(n);
        if(Evendigits % 2 == 0){
            return true;
        }
        return false;
    }
}
/* Math.log10(num) answers:
  10 ko kitni power dein ki num mile?

  Math.log10(100) ==> 10^2 = 100


  DSA mein iska use kahan hota hai?

Most commonly number of digits find karne mein.

For a positive integer num:

int digits = (int)Math.log10(num) + 1;

Example:

num = 5832

log10(5832) ≈ 3.765

Integer conversion:

(int)3.765 = 3

Then:

3 + 1 = 4

So 5832 has 4 digits.
*/