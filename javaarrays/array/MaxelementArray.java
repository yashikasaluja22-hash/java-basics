public class MaxelementArray {
    public static void main(String[] args) {
        int[] arr = {99, 6, 1000, 37634, 89};
        MaxElement(arr);
    }
    static void MaxElement(int[] nums){
        int largest = nums[0];
        if(nums.length == 0){
            System.out.println("No elements in array");
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        System.out.println(largest);
    }
}
