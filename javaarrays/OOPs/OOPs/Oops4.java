public class Oops4 {
    //This file also contains CONSTRUCTOR OVERLOADING
    public void main(String[] args){
    Student s1 = new Student(33, "Sarah");
    Student s2 = new Student(s1);
    System.out.println(s2.rollNo);
    System.out.println(s1.name);

    Student s3 = new Student();
    System.out.println(s3.rollNo);
    System.out.println(s3.name);
    }
class Student {
   int rollNo;
   String name;
   Student(){ //constructor 1
       rollNo = 0;
       name = "unknown";
   }
 Student(int rollNo,String name){ //constructor 2
     this.rollNo = rollNo;
     this.name = name;
 }
 //we r taking values of other object and for that we r making  a constructor
    Student(Student other){ //comstructor 3
     this.rollNo = other.rollNo;
     this.name = other.name;
    }
}
}
