public class Minimumelement {
    public static void main(String[] args) {
     int[] arr = {2,3,43,1,0,-1};
     System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        if(arr.length == 0) return -1;
        int min = arr[0];
        for(int x : arr){
            if(x < min){
                min = x;
            }
        }
        return min;
    }
}
