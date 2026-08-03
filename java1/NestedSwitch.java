import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();
        switch (empID){
            case 1:
                System.out.println("Kunal Ksuhwaha");
                break;
            case 2:
            System.out.println("Yashika Saluja");
            break;
            case 3:
                System.out.println("Hardik Saluja");
                break;
            case 4:
                System.out.println("Employee 4: ");
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("Department not found");
                }
            default:
                System.out.println("EmpID not found");
                break;
        }
    }
}
