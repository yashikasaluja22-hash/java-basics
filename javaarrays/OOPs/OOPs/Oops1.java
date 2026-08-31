public class Oops1 {
    public void main(String[] args) {
     Student1 a = new Student1();
     System.out.println(a.name);

     Student2 b = new Student2("yashika", 22);
     System.out.println(b.name1);
    }
    class Student1{
       String name = "unknown";
       int age = 0;
    }
    /*class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }
} u can this too for class Student1 or above procedure both are same*/


    //another class with this keyword
class Student2{
        String name1;
        int age1;
        Student2(String name1, int age1){
            this.name1 = name1;
            this.age1 = age1;
        }
    }
}
//without using this keyword every object of class will have same values intially
// but ith this keyword and a separate parametrised constructor every object of that class can have different values
/*Why this is needed?

Because the parameter and instance variable have the same name:*/