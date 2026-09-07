interface Engine{
     int num = 99;
    void stop();
    void start();
   private void acc(){
       System.out.println("i m in Rectangle");
   } //now u cannot override this method in child class
}

interface Radio{

    int getAge();

    abstract void show();
    void rstart();
    void rstop();
}

class Car1 implements Engine,Radio{


    @Override
     //if u dont use this keyword --> error will be shown
    public void stop(){
        System.out.println("stop the engine");
    }

    @Override
    public void start() {
    System.out.println("start the engine");
    }


     void acc() {
        System.out.println("acc the engine");
    }

    @Override
    public void rstart() {
     System.out.println("start the radio");
    }

    @Override
    public void rstop() {
        System.out.println("stop the radio");
    }

    @Override
    public void show() {
        System.out.println("show the radio");
    }
    @Override
    public int getAge(){
        return 100;
    }

    int getNum(){
        return num;
    }
}
public class Interface {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.start();
        car.rstop();

        System.out.println(car.num);
        System.out.println(Engine.num);
        car.acc(); //this will call the Car class wala acc() method
       //if u remove Car wala varaible num then -->Sopln(car.num) -->output will be 99 --> same interface wala

       // Engine.acc(); --> this line will show error

        System.out.println(car.getNum());
    }
}
