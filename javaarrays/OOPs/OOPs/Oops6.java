public class Oops6 {
    public void main(String[] args){
        final int a = 10;
        //a = 20; --> error wali line
        //FOR PRIMITIVES --> if u r using final keyword then value for primitves will not be changes/updated
        System.out.println(a);
        final A Kunal = new A("hello yaar");
        Kunal.name = "bas yaar";
       // Kunal = new A("kitty"); --> this is a error wali line, as u r reaasigning value
        System.out.println(Kunal.name);
        //for NON-PRIMTIVES --> u can change/update values but cant reaasign them



    }
class A{
   String name;
   A(String name){
       this.name = name;
   }
}
}
