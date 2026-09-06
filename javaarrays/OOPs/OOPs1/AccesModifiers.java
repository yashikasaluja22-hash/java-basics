class A{
    int num;
    private String name;
    protected int age;
    public double gpa;

    public String getNum(){
        return name;
    }

    String getNum(String name){
        this.name=name;
        return name;
    }
}
public class AccesModifiers {
   public static void main(String[] args) {
        //lets see ki access modifier ko kitna access kar sakte hai
       A a = new A();
       a.num = 4;
       // a.name = "yashika" --> shows error
       a.age = 45; //can access like this
       a.gpa = 4.4;

       //lets ki agar private member can be accessed thru a public method
       System.out.println(a.getNum()); // yes, we can access like this

       System.out.println(a.getNum("yashika"));
       //so we can access private data members through public methods or constructors
    }
}
