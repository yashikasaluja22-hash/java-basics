public class SearchtwoDarray {
    public static void main(String[] args) {
        int[][] hey = {
                {23, 78, 56},
                {100, 99, 98},
                {27, 91, 92},
        };
        int target = 100;
        System.out.print(search(hey, target));
    }
    //here we will return 2 values or a array
    static int[] search(int[][] arr, int target){
        if(arr.length == 0) return new int[]{-1, -1};
        //here new is a keyword
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        //another way for 2d foreach loop
        /* for(int[] x : arr){
            for(int element : x) {
               if(element == target) return blah blah;
               }
              }
         */
        return new int[]{-1, -1};
    }
}
