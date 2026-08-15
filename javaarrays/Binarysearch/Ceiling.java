package Binarysearch;
//This ques is for a already sorted array
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(Ceiling(arr, target));
    }
    static int Ceiling(int[] arr1, int target){
        int start = 0;
        int end = arr1.length - 1;

        if(target > arr1[arr1.length - 1]) return -1;

        while(start <= end){
            int mid  = start + (end - start)/2;
            if(arr1[mid] == target){
                return mid;
            }
            else if(arr1[mid] < target){
                start = mid + 1;
            }
            else if(arr1[mid] > target){
                end = mid - 1;
            }
        }
        return start;
    }
}
