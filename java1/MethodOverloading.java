import java.util.Arrays;
public class MethodOverloading {
    public static void main(String[] args) {
    //in METHOD OVERLOADING, we give same name to many variables,but those all needs to be distibguished
    //like parameters

        fun("Yashika");
        fun(57, 89, 9900, 80023);
        fun(200, 300);
        fun(5);
        fun(9, 7);
    }
    static void fun(int a){
      System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static int fun(int a, int b){
        return a+b;
    }
    static void fun(int a, int ...v){
        System.out.println(Arrays.toString(v));
    }
}
