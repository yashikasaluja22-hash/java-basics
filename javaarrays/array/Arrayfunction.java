import java.util.Arrays;
public class Arrayfunction {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 100;
    }
    //ARRAYS IN JAVA ARE MUTABLE
    //a mutable object is an object whose internal state (its data members or fields) can be changed after it is created
}
