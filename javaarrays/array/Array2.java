import java.util.Scanner;
import java.util.Arrays;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        //taking input for arrays
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //printing
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //OR
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        //OR
        System.out.println(Arrays.toString(arr));

        //so there are 3 ways to print an array but last method
        //System.out.println(Arrays.toString(arr)); is the best one
    }
}
