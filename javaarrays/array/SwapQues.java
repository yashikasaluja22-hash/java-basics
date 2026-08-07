public class SwapQues {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 100, 89};
        swap(arr, 1, 4);
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
