public class Print3digitArmstrong {
    public static void main(String[] args) {
        //print all 3 digit Armstrong numbers
        for(int i = 100; i < 1000; i++){
            int a = i;
            int sum = 0;
            while (a > 0) {
                int rem = a % 10;
                sum += Math.pow(rem, 3);
                a /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
