package EmployeeManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        Employee.ImportData();
        do {
            System.out.println("1. Add Employee");
            System.out.println("2. Show All Employee");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Details Employee");
            System.out.println("5. Edit Employee");
            System.out.println("6. Delete Employee");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        Employee.addEmployee();
                        break;
                    case 2:
                        Employee.showAllEmployee();
                        break;
                    case 3:
                        Employee.searchEmployeeByName();
                        break;
                    case 4:
                        Employee.detailEmployee();
                        break;
                    case 5:
                        Employee.editEmployee();
                        break;
                    case 6:
                        Employee.deleteEmployee();
                        break;
                    case 7:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Invalid input! Please enter a number.");
            }
        } while (choice != 7);
        input.close();
    }
}
