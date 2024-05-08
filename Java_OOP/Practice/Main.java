package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Number number = new Number();
        StudentID studentID = new StudentID();
        Triangle triangle = new Triangle();
        singleString singleString = new singleString();
        Array array = new Array();
        int choice = 0;
        do {
            System.out.println("1. Check number (Positive/Negative)");
            System.out.println("2. Convert number to text");
            System.out.println("3. Check valid Triangle");
            System.out.println("4. Sum of even number");
            System.out.println("5. Print multiple number");
            System.out.println("6. Check Student ID with regex B170xxxx: ");
            System.out.println("7. Check Student ID with regex 00dLxxx: ");
            System.out.println("8. Find keyword in String");
            System.out.println("9. Find min in Array");
            System.out.println("10. Reverse array");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> number.checkNumber();
                    case 2 -> number.convertNumber();
                    case 3 -> triangle.CheckTriangle();
                    case 4 -> number.sumOfEvenNumber();
                    case 5 -> number.printMultipleNumber();
                    case 6 -> studentID.Exercise6();
                    case 7 -> studentID.Exercise7();
                    case 8 -> singleString.findKeyword();
                    case 9 -> array.minArray();
                    case 10 -> array.reverseArray();
                    case 11 -> System.out.println("Exiting program!");
                    default -> System.out.println("Invalid choice! Please try again.");
                }
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Invalid input! Please enter a number.");
            }
        } while (choice != 11);
    }
}
