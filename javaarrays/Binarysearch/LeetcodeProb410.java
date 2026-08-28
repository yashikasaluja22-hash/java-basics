package Binarysearch;

public class LeetcodeProb410 {
    class Solution {
        public int splitArray(int[] nums, int k) {
            //here we will apply binary search not in array but in the possible largest sums
            int low = 0;
            int high = 0;
            for(int num : nums){
                low = Math.max(low, num);
                high += num;
            }
            while(low < high){
                int mid = low + (high - low)/2;
                int subarrays = 1;
                int currentsum = 0;
                for(int num : nums){
                    if(currentsum + num <= mid){
                        currentsum += num;
                    }else{
                        subarrays++;
                        currentsum = num;
                    }
                }
                if(subarrays > k){
                    low = mid + 1;
                }else{
                    high = mid;
                }
            }
            return low;
        }
    }
}
