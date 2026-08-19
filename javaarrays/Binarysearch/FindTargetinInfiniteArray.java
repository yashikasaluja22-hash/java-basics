package Binarysearch;
//this is amazon interview ques
//u r given sorted array of infinite numbers and its size u dont know neither u can use arr.length
public class FindTargetinInfiniteArray {
    public static void main(String[] args){
    int[] arr = {2, 3, 4, 5, 5, 8, 9, 12, 14, 15, 20, 23, 55};
    int target = 15;
    System.out.println(ans(arr,target));
    }
    //function to find range in array & will give answer index too
    //u need to return index if u find target in that infinite array
    static int ans(int[] arr, int target){
     //first find range
        //first find with a box/subarray of size 2
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;//this is our mew start
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return Binarysearch(arr, target, start, end);
    }

    //Binary Search function
    static int Binarysearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
