package Binarysearch;
import java.util.Arrays;
public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] arr =
                        { {2, 3, 4},
                        {4, 5, 6},
                        {7, 8, 19} };
        int target = 19;
        System.out.println(Arrays.toString(SearchMatrix(arr, target)));
    } // How to search a target element in matrix
    static int[] SearchMatrix(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; }
}
