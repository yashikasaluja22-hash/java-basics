public class Oops3 {
    public void main(String[] args) {
    Student s1 = new Student(55, "lily");
    System.out.println(s1.name);
    System.out.println(s1.rollNo);
    //now here the value of name & rollNo for object s1 will not be changed
        //for this we need to use keyword "this"
    }
class Student {
    int rollNo = 0;
    String name = null;

    Student(int rollNo, String name) {
        rollNo = rollNo;
        name = name;
    }

    /*Student(int roolNo, String n) {
        this.rollNo = rollNo;
        this.name = name;
    }*/ //this constructor shud be used instead of pehla wala constructor --> if u want values to be changed
}
}
