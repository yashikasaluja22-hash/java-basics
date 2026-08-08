import java.util.Arrays;
public class Linearsearch2 {
    public static void main(String[] args) {
        /*we use--> arr.length : as here length acts as a variable
        but with string we use
        str.length() : as length here is a function
        and str is name of string
         */
        String hello = "aada paada kisne paada";
        char ch = 'd';
       System.out.println(search(hello, ch));

       //to print a string in character
        String hi = "Yashika";
        System.out.println(Arrays.toString(hi.toCharArray()));
        char ch1 = 'a';
        System.out.println(search(hi, ch));

    }
    static boolean search(String str, char target){
        if(str.length() == 0) return false;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
    //another way of this doing this function

    static boolean search2(String str, char target){
        if(str.length() == 0) return false;
        for(char ch : str.toCharArray()){
            if(ch == target) return true;
        }
        return false;
    }

}
