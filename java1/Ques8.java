import java.util.Scanner;
public class Ques8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++){
               arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            System.out.println("Sum of row " + (i+1) + ":  " + sum);

        }
    }
    //homework
}//write a program to form transpose of matrix
//write a program to check whether email entered by user contains @ and .com
//write a program to count total number of words in a string
