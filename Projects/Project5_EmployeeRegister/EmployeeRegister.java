package Project5_EmployeeRegister;

import java.util.*;

// Employee class to store details
class Employee implements Comparable<Employee> {
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private String address;

    // Constructor
    public Employee(String firstName, String lastName, String mobile, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    // Getter for sorting
    public String getFirstName() {
        return firstName;
    }

    // For displaying data in formatted output
    @Override
    public String toString() {
        return String.format("%-15s %-15s %-15s %-30s %-15s",
                firstName, lastName, mobile, email, address);
    }

    // Compare employees by first name (alphabetically)
    @Override
    public int compareTo(Employee e) {
        return this.firstName.compareToIgnoreCase(e.firstName);
    }
}

public class EmployeeRegister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>(); // Generic Collection

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Employee " + i + " Details:");

            System.out.print("Enter the Firstname: ");
            String firstName = sc.nextLine();

            System.out.print("Enter the Lastname: ");
            String lastName = sc.nextLine();

            System.out.print("Enter the Mobile: ");
            String mobile = sc.nextLine();

            System.out.print("Enter the Email: ");
            String email = sc.nextLine();

            System.out.print("Enter the Address: ");
            String address = sc.nextLine();

            // Add employee to list
            employees.add(new Employee(firstName, lastName, mobile, email, address));
        }

        // Sort employees by first name
        Collections.sort(employees);

        // Display Employee List
        System.out.println("\nEmployee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n",
                "Firstname", "Lastname", "Mobile", "Email", "Address");

        for (Employee e : employees) {
            System.out.println(e);
        }

        sc.close();
    }
}

