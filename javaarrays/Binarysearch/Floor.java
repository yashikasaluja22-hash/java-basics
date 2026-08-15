package Binarysearch;
//for a already sorted array ques
public class Floor{
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(Floor(arr, target));
    }
    static int Floor(int[] arr1, int target){
        int start = 0;
        int end = arr1.length - 1;

        if(target < arr1[0]) return -1;

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
        return end;
    }
}
