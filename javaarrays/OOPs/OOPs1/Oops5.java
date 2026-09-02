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
/* primitive types are the basic built-in
 data types used to store simple values such as numbers, characters, and true/false values.
 eg: boolean, short, int, long, float, double, char, byte.

 we do not use the new keyword with primitive data types.
 no new is needed because primitives store the actual value directly.
*/