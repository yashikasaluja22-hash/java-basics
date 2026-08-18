package Binarysearch;
// this is a leetcode problem 34, open it
public class LeetcodeProb34 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
    }
    //leetcode solution starts from here
    public int[] searchRange(int[] nums, int target) {
        int first = FindFirst(nums, target);
        int last = FindLast(nums, target);
        return new int[]{first, last};
    }
    //this is how u create functions in leetcode
    //to find first occurence of target
    public int FindFirst(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == nums[mid]){
                ans = mid; //as u need to return index
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }

    //to find last occurrence of target
    public int FindLast(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == nums[mid]){
                ans = mid;
                start = mid + 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
