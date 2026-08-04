public class Shadowing {
    static int  x = 90;
    public static void main(String[] args){
    System.out.println(x);
    int x = 40;
    System.out.println(x);
    fun();
    fun2(x);
    }
    static void fun(){
        System.out.println(x);
    }
    static void fun2(int num){
        System.out.println(num);
    }
}
