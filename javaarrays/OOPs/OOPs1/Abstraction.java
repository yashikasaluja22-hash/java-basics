abstract class Parent1{
    int age;
    abstract void career(String name);
    abstract void partner();

    int getAge(){
        return age;
    }
}
class daughter extends Parent1{
    daughter(int age){
        this.age = age;
    }
    @Override
    void career(String name) {
        System.out.println("i m going to be a " + name);
    }
    @Override
    void partner() {
        System.out.println("i like gilbert");
    }
    @Override
    int getAge(){
        return 80;
    }
}
public class Abstraction {
}
