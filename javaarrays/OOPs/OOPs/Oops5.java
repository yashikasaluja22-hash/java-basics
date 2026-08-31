public class Oops5 {
    public void main(String[] args){
      Student s1 = new Student();
      System.out.println(s1.rollNo);
    }
class Student{
 int rollNo;
 String name;
 Student(int rollNo,String name){
     this.rollNo=rollNo;
     this.name=name;
 }
 Student(){
     //this is how u call another constructor from one constructor
     this(112, "kitchen king");
     //so here by calling this constructor --> upar wala parameterised constructor will be called
 }
}
}