package Binarysearch;
//we dont have a target in this problem
//only find the moutain index of array
//this is also solution to LeetCode Prob 162
public class LeetcodeProb852 {
    public static void main(String[] args) {
       int[] arr = {0,1,3,5,7,4,3,2};
       System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
            while(start < end){
                int mid = start + (end - start)/2;
                if(arr[mid] < arr[mid + 1]){
                    start = mid + 1;
                }else{
                    end = mid;
                }
            }
            return start;
    }
}
