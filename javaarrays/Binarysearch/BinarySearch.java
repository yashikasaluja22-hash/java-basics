package Binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
    int[] hello = {-1, -2, -99, 0 ,1, 55, 66 , 891, 663, 56, 89, 100, 99};
    int target = -99;
    System.out.println(binarysearch(hello, target));
    }
    //return index no.
    //return -1 if not exists no
    static int binarysearch(int[] arr, int target){
       int start = 0;
       int end = arr.length - 1;
       while(start <= end){
           int mid = start + (end - start)/2;

           if(target < arr[mid]){
               end = mid - 1;
           }
           else if(target > arr[mid]){
               start = mid + 1;
           }
           else{
               return mid; //index number
           }
       }
       return -1; //element not found
    }
}
