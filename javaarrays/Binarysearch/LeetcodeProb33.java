package Binarysearch;

public class LeetcodeProb33 {
    public int search(int[] nums, int target) {
        int hi = FindPivot(nums);
        int ans1 = FirstPart(nums, target, hi);
        if(ans1 != -1){
            return ans1;
        }
        return SecondPart(nums, target, hi);
    }
    //function to find pivot in array
    public int FindPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[mid+1]){
                return mid;
            }else if(nums[mid] > nums[end]){
                start = mid + 1;
            }else{//if above else if condition is false then below code will execute
                end = mid;
            }
        }
        return start;//this is our index number of pivot
    }

    //function to apply BS in first part of array
    public int FirstPart(int[] nums, int target, int start){
        int start2 = 0;
        int end2 = start;
        while(start2 <= end2){
            int mid = start2 + (end2 - start2)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end2 = mid - 1;
            }else{
                start2 = mid + 1;
            }
        }
        return -1;
    }

    //to find target in second part of array
    public int SecondPart(int[] nums, int target, int start){
        int start2 = start + 1;
        int end2 = nums.length - 1;
        while(start2 <= end2){
            int mid = start2 + (end2 - start2)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end2 = mid - 1;
            }else{
                start2 = mid + 1;
            }
        }
        return -1;
    }
}
