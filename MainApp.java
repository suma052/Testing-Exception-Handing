import java.util.Scanner;
import validation.AgeValidation;
import validation.DeptValidation;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();   // clear buffer

            System.out.print("Enter department: ");
            String dept = sc.nextLine();

            AgeValidation.validateAge(age);
            DeptValidation.validateDept(dept);

            System.out.println("All validations successful");

        } catch (Exception e) {
            System.out.println("Validation Error: " + e.getMessage());
        } finally {
            System.out.println("Validation process completed");
        }

        sc.close();
    }
}
