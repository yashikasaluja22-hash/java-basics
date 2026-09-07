//YOU CAN EVEN EXTEND INTERFACES
interface X{
    void greet();

    //static interface shud always have a method body
    static void greeting(){
        System.out.println("hello");
    }
}
interface Y extends X{
    void fun();
}

//child class
class child1 implements Y{

    @Override
    public void fun() {

    }

    @Override
    public void greet() {

    }
}
public class Interface2 {
    public static void main(String[] args) {
        child1 c1 = new child1();
        // c1.greeting(); is wrong
        X.greeting();
    }
}
