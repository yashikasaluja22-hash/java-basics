class Box {
    double l;
    double h;
    double w;
    private double s;

    Box() {
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    Box(double side) {
        this.h = side;
        this.w = side;
        this.l = side;
    }

    Box(double l, double w, double h, double s) {
        this.l = l;
        this.w = w;
        this.h = h;
        this.s = s;
    }

    Box(Box obj) {
        //here Box is class and obj is its object
        //below line means u r copying h ki value of obj object to the object this keyword id currently pointing to
        this.h = obj.h;
        this.l = obj.l;
        this.w = obj.w;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
class Boxweight extends Box{
    double weight;
    Boxweight(){
        this.weight = -1;
    }
    public Boxweight(double la, double h, double w, double weight, double s){
        super(la, h, w, s);
        this.weight = weight;
    }
}
public class inherit1{
    public static void main(String[] args) {
     Boxweight b = new Boxweight();
     System.out.println(b.l + " " + b.weight);

     Boxweight b1 = new Boxweight(40.5, 55, 1.2, 99, 5.5);
     System.out.println(b1.l +" "+b1.h+" "+b1.w+" "+b1.weight);
    }
    //if u make l private --> private l; --> inside boc class
    //then u can access/modify l inside box class not inside even in child class
    //and u cannot do like this--> Box.l/Boxweight.l -->this is error outside Box class

    /*Are private members inherited in Java?"

    Say:
    Private members are not inherited by child class.
    Private members are not directly accessible or inherited by the subclass.
    They remain encapsulated within the superclass, and the subclass can access them
    indirectly through public/protected methods provided by the superclass.
    */
}
