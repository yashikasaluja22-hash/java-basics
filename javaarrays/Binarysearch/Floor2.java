package Binarysearch;
//this is brute force solution for floor problem
//we r dealing with a sorted array here
public class Floor2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(Floor2(arr, target));
    }
    static int Floor2(int[] arr, int target){
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] <= target){
                return i;
            }
        }
        return -1;
    }
}// TC = O(N) & SC = O(1)
