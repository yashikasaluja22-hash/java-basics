package Binarysearch;
//this is a brute force solution and need to return index
public class Ceiling2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(Ceiling2(arr, target));
    }
    static int Ceiling2(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){ //as this is a sorted array
            if(arr[i] >= target){
                return i;
            }
        }
        return -1;
    }
}
