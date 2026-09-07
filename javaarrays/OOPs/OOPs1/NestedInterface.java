class A1{
    interface hi{
       boolean isOdd(int num);
    }
}
class A2 implements A1.hi{
    @Override
    public boolean isOdd(int num) {
        return num%2==0;
    }
}
public class NestedInterface {
    public static void main(String[] args) {
        A2 a2 = new A2();
        System.out.println(a2.isOdd(12)); //will give output
    }
}
