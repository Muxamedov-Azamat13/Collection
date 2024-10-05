import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee_Collection directory = new Employee_Collection();

        directory.addEmployee(new Employee_Directory(1, "+123456789", "Alice", 5));
        directory.addEmployee(new Employee_Directory(2, "+987654321", "Bob", 3));
        directory.addEmployee(new Employee_Directory(3, "+112233445", "Alice", 7));


        List<Employee_Directory> employeesWithFiveYears = directory.getEmployeeExperience(5);
        System.out.println("Employees with 5 years of experience: " + employeesWithFiveYears.size());


        List<String> phoneNumbersForAlice = directory.getPhoneNumber("Alice");
        System.out.println("Phone numbers for Alice: " + phoneNumbersForAlice);


        Employee_Directory employee = directory.getId(2);
        if (employee != null) {
            System.out.println("Employee with ID 2: " + employee.getName());
        }
    }
}
