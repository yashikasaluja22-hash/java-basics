import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {100, 7, 89, 55, 30};
        reverse(arr, 0, 4);
    }
    static void reverse(int[] nums, int start, int end){
        if(nums.length == 1) {
            System.out.println("empty array");
        }
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
    }
        System.out.println("reversed array " + Arrays.toString(nums));
    }
}
