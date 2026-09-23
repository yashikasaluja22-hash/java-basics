public class MissingNumber {

    //ans starts from here
    class Solution {
        public int missingNumber(int[] nums) {
            int flag = 0;
            for(int i = 0; i <= nums.length; i++){
                flag = 0;
                for(int j = 0; j < nums.length; j++){
                    if(nums[j] == i){
                        flag = 1;
                    }
                }
                if(flag == 0){
                    return i;
                }
            }
            return -1;
        }
    }
}
