public class Oops7 {
    public void main(String[] args){
     Human a = new Human(22, "Sarah", 10000, true);
     Human b = new Human(54, "harry", 2000, false);
     System.out.println(a.population);
     System.out.println(b.population);
    }
class Human{
   int age;
   String name;
   int salary;
   boolean married;
   static long population;
   Human(int age, String name, int salary, boolean married){
       this.age = age;
       this.name = name;
       this.salary = salary;
       this.married = married;
       Human.population += 1;
   }
}

}
