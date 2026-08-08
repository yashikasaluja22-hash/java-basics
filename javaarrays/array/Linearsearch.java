public class Linearsearch {
    public static void main(String[] args) {
        //if number is in array then index no. will be returned
        //if not then return -1
        int[] arr = {22, 44, 11, 0, 1, 99, 866, 78, 8, 100};
        int hi = 99;
        System.out.println(LinearSearch(arr, hi));
    }
    static int LinearSearch(int[] nums, int target){
        if(nums.length == 0) return -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
