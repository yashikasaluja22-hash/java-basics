public class Oops2 {
    public void main(String[] args) {
        Student s1 = new Student(22, "yashika");
        s1.changeName("kitty");
        s1.greeting();
    }
class Student{
   int age;
   String name;
  Student(int age,String name){
      this.age=age;
      this.name=name;
  }

  void changeName(String name){
      this.name = name; //agar idhar sirf --> name = name karoge toh jab upar greeting wala function call hokar
      //print kraga toh naya name update nhi hoga, so--> this keyword is important
  }
  void greeting(){
      System.out.println("Hello! my name is " + name); //u will get same output with both lines but
      System.out.println("Hello! my name is " + this.name);//"this" makes it more specifc to object, more good practice
  }
}
}
