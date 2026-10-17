public class recursion {
      static boolean palindrome(String s, int left, int right) {

          if (left >= right)
              return true;

          if (s.charAt(left) != s.charAt(right))
              return false;

          return palindrome(s, left + 1, right - 1);
      }
    public static void main(String[] args){
    System.out.println(palindrome("aba",0,2));
    }
}
