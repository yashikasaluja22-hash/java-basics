public class Array {
    public static void main(String[] args) {
      int[]  arr = new int[3];
      String[] arr2 = {"A", "B", "C"};
      for(String s : arr2){
          System.out.println(s);
      }
      int[][] arr3 = {{1, 2, 3},
                  {4, 5, 6}};
      for(int i = 0; i < arr3.length; i++){
          for(int j = 0; j < arr3[i].length; j++){
              System.out.print(arr3[i][j] + " ");
          }
          System.out.println();
      }
      //OR
      for(int[] row :arr3){
          for(int num : row){
              System.out.print(num);
          }
          System.out.println();
      }
    }
}
