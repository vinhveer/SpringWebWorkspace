package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    private static final Scanner input = new Scanner(System.in);
    private double firstEdge;
    private double secondEdge;
    private double thirdEdge;

    public Triangle() {
    }

    private double getValidEdge(String edgeName) {
        while (true) {
            try {
                System.out.print("Enter " + edgeName + ": ");
                return input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                input.nextLine();
            }
        }
    }

    private void enterEdge() {
        firstEdge = getValidEdge("firstEdge");
        secondEdge = getValidEdge("secondEdge");
        thirdEdge = getValidEdge("thirdEdge");
    }
    public void CheckTriangle() {
        enterEdge();

        if (firstEdge + secondEdge > thirdEdge && secondEdge + thirdEdge > firstEdge && firstEdge + thirdEdge > secondEdge) {
            System.out.println("This is a Triangle!");
        } else {
            System.out.println("This is not a Triangle!");
        }
    }
}
