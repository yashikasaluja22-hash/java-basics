
public class Introjava2 {
        public static void main(String[] args) {
            System.out.println("Hello world");
            System.out.println(args[0]);//will print the 0 index of String[] array
            //input will be given in command line
        }
    }
/* 1. ur java program looks for main function whatever is ur file or code ur first function
shud be main only, main function is like entry point for java code

2. we write public for function to make the function accessible anywhere/anybody
another access modifier

3.why static keyword? cus we want to make and run a function here without creating an object of Main class

4. why void? like what u wanna return at last in that function

5. String[] args --> String[] is an array & args is command line arguments
so, if u write anything on command line (terminal:powershell) it will be saved in String[] array
code in command line: java Main1 23 or java Main1 "hey"
now "hey"/23 will become 0 index of String[] array and u can add more values to its indices using code
*/

