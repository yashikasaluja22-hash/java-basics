public class SearchinRange {
    public static void main(String[] args) {
    int[] arr = {1, 22, 33, 4, 66, 100, 100000, 7384};
    int target = 22;
    System.out.println(Range(arr, target, 2, 6));
    }
    static int Range(int[] arr, int target, int start, int end){
        if(arr.length == 0) return -1;
        for(int i = start; i <= end; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }
}
