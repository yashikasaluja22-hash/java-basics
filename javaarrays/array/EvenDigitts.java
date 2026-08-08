public class EvenDigitts {
    public static void main(String[] args) {
        //here for eg: no. --> 766 => has odd no. of digits
        //no. --> 7661 => has even no. of digits
        // in this ques we need to check whether a no. contains even digits or not
     int n = 9000000;
     System.out.println(EvenDigits(n));
    }
    static boolean EvenDigits(int n){
     int numberofDigits = Digits(n);
     if(numberofDigits %2 == 0) return true;
     return false;
    }
    static int Digits(int n){
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }
}
