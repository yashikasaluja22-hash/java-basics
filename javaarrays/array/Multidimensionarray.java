import java.util.Scanner;
import java.util.Arrays;
public class Multidimensionarray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},// 0 index
                {4, 5,}, // 1 index
                {7, 8, 9, 100}};
        //int[][] arr = new int[3][]
        //above u need to secify atleast rows number, entering no. of columns is optional

        //TAKING INPUT FOR 2D ARRAY
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr1 = new int[rows][cols];
        for(int i = 0; i < arr1.length; i++){//arr.length == no. of rows
            for(int j = 0; j < arr1[i].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        //TO PRINT ARRAY OUTPUT
        for(int row = 0; row < arr1.length; row++){
            for(int col = 0; col < arr1[row].length; col++){
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();//to print like a matrix
        }

        //OR (another way to print 2d matrix)
        for(int row = 0; row < arr1.length; row++){
            System.out.println(Arrays.toString(arr1[row]));
        }

    }
}
