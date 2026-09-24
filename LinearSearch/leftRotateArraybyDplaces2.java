public class leftRotateArraybyDplaces2 {
    //THIS IS OPTIMAL SOLUTION OF THIS PROBLEM
    //TC = O(N), SC = O(1)
    class Solution {
        public void rotateArr(int arr[], int d) {
            d = d % arr.length;
            reverse(arr, 0, (d-1));

            reverse(arr, d, (arr.length - 1));

            reverse(arr, 0, (arr.length - 1));
        }
        public void reverse(int arr[], int start, int end){
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}
