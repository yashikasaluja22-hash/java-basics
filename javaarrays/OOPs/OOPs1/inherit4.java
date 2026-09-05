//static methods cannot be overriden in java
// run and check output

/*Can static methods be overridden?

Answer:
No. Static methods are class-level and are not overridden;
if a subclass defines a static method with the same signature, it is called method hiding.
*/
class Parent {
    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
   // @Override --> this line shows error here, check by removing comments
    static void show() {
        System.out.println("Child");
    }
}
public class inherit4 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
