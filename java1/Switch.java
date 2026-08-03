import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        switch(fruit){
            case "mango":
                System.out.println("KING OF FRUITS");
                break;
            case "apple":
                System.out.println("KEEPS DOCTOR AWAY");
                break;
            case "orange":
                System.out.println("ROUNF FRUIT");
                break;
            case "banana":
                System.out.println("MONKEY EATS IT");
                break;
            default:
            System.out.println("ERROR");
            break;
        }

        //there is another way of using SWITCH
        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("ERROR");
        }//here imagine that after/with every case there is a invisible break

        //OR
        switch(day){
            case 1, 2, 3, 4 ,5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

    }
}
