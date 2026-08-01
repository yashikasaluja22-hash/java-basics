
    //so this is a file which contains a class and name of this class is what u give as a name to ur file ___.java
//here that class is main due to Main.java
//create name of a class (file) with first letter --> good practice by convention

    public class Introjava {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
/*why use keyword: public --> with our main (original) class, what's the need?
bcuz suppose u want to use this file or this file is included with some other files but u dont want anyone
to the see the code --> then u use access modifiers */



/*When you change your code

Suppose you edit Main.java.

Then you need to:

javac Main.java
java Main

Reason:

javac compiles your .java file into a .class file.
java Main runs the compiled .class file. */

