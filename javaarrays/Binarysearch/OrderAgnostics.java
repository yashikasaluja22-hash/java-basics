package Binarysearch;

public class OrderAgnostics {
    public static void main(String[] args) {
    int[] arr = {-22, -1, 0, 22, 90, 100, 123, 124, 1111, 1000000};
    int target = 1111;
    System.out.println(OrderAgnosticsBS(arr, target));
    }
    static int OrderAgnosticsBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //to check whether sorted array is ascending or descending order
        boolean isAscending;
        if(arr[start] > arr[end]) {
            isAscending = false;
        } else{
            isAscending = true;
        }

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAscending){
                if(target > arr[mid]) start = mid + 1;
                else if(target < arr[mid]) end = mid - 1;
            }else {//if sorted order is descending
                if(target < arr[mid]) start = mid + 1;
                else if(target > arr[mid]) end = mid - 1;
            }
        }
        return -1;
    }
}
