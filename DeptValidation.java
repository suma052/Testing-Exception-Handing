package validation;

public class DeptValidation {

    public static void validateDept(String dept) throws Exception {
        if (!(dept.equals("CSE") || dept.equals("EEE") || 
              dept.equals("BBA") || dept.equals("ENG"))) {
            throw new Exception("Invalid Department");
        }
        System.out.println("Department is valid");
    }
}
