import java.util.Arrays;//remenber this line too
public class Variableargs {
    public static void main(String[] args) {
     fun(2, 3, 5, 78, 200, 100);
     fun();
    }
    static void fun(int ...v){//instead of int here u can give code String, etc
        System.out.println(Arrays.toString(v));
    }
    //here u can give any number of variables in above function
    //even u can give empty function means u can give no variable/empty argument
}
