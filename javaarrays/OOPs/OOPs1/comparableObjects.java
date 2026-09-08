import java.util.Arrays;
import java.util.Comparator;

// U can compare 2 objects of same class using an in-built interface Comparable
//this interface help u comapre some parameter of object
//for that u need to override Comparable interface method inside ur Student1 class
class Student1 implements Comparable<Student1> { //<Student1> means ur comparing objects of Student1
    int rollno;
    float  marks;

    public Student1(int rollno, float marks){
        this.rollno = rollno;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student1 o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
        //if diff = 0 then both objects are equal
        // if diff < 0 then o is bigger than this(Wali object)
    }
}
public class comparableObjects {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1, 88.95f);
        Student1 s2 = new Student1(3, 90.90f);
        Student1 s3 = new Student1(2, 45.90f);
        Student1 s4 = new Student1(3, 12.90f);

        //creating student class array
        Student1[] list = {s1, s2, s3, s4};
        System.out.println(Arrays.toString(list));

        //now we will sort the Student1 array
        //so java will sort acc to marks parameter as we have provided comparable interface with a compareTo method
        //that compares marks of objects, but if u remove that interface it will show error as it will be confused
        //as which parameter to compare for sorting the array
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        //but if u want custom sort --> means u want sort using some other parameter--> use the comaparble interface and do this
        Arrays.sort(list, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return (int)(o1.marks - o2.marks); //it will automaticlly swap if needed
            }
        });
        System.out.println(Arrays.toString(list));

        if (s1.compareTo(s2) < 0) {
            System.out.println(s1.compareTo(s2));
            System.out.println("s2 has more marks!!");
        } else if (s1.compareTo(s2) > 0) {
            System.out.println(s1.compareTo(s2));
            System.out.println("s1 has more marks!!");
        }else{
            System.out.println(s1.compareTo(s2));
            System.out.println("both have equal marks!!");
        }
    }
}
