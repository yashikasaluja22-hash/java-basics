import java.util.ArrayList;
import java.util.Scanner;
public class Dynamicarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //here ArrayList is Java ka vectors
        ArrayList<Integer> arr1 = new ArrayList<>(5);//here 5 is just intial capacity, cud be changed
        arr1.add(1);
        arr1.add(200);
        arr1.add(400);
        arr1.add(300);
        arr1.add(90);
        arr1.add(79);

        System.out.println(arr1);//here it will print array in a single line
        //to modify array or replace an index element
        arr1.set(0, 15);

        //to remove an element at an index
        arr1.remove(2);
        System.out.println(arr1);

        //to chech whether array contains this element or not--> will return true/false accoridingly
        System.out.println(arr1.contains(90));

        //to take input for dynamic arrays
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            arr2.add(sc.nextInt());
        }

        //to print dynamic array (2 ways)
        for(int i = 0; i < arr2.size(); i++){
            System.out.println(arr2.get(i));//pass index here -->get(i)
        }
        //OR simply
        System.out.println(arr2);

    }
}
