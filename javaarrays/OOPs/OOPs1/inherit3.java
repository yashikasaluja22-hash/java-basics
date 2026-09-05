class hello{
    int addNum(int a , int b){
        return a+b;
    }
    double addNum(double a, double b){
        return a+b;
    }
    int addNum(int a, int b, int c){
        return a+b+c;
    }
}
//this is an example of method overloading
//under compile - time polymorphism
public class inherit3 {
    public static void main(String[] args) {
        hello obj = new hello();
        System.out.println(obj.addNum(1,2,3));
    }
}
