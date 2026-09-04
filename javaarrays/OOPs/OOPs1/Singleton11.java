class Student{
    private static Student obj = new Student();

    private Student(){
        System.out.println("i m inside a class");
    }

    //u can also not use public keyword here with method --> ur choice
    public static Student getInstance(){
        return obj;
    }
}
public class Singleton11 {
        public static void main(String[] args) {

            Student s1 = Student.getInstance();
            Student s2 = Student.getInstance();
            Student s3 = Student.getInstance();
            // our private constructor will be called only once

            //try to see output with & without making this below system.out wala code in comments
            System.out.println(s1 == s2);
            System.out.println(s2 == s3);
        }
    }
