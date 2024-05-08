package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {
    private final ArrayList<Integer> arr = new ArrayList<>();

    private static final Scanner input = new Scanner(System.in);

    private int number;

    public Array() {
    }
    private int getNumber() {
        while (true) {
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Please enter a number!");
            }
        }
    }
    private void inputArray() {
        System.out.print("N = ");
        number = getNumber();

        for (int i = 0; i < number; i++) {
            System.out.printf("a[%d] = ", i);
            arr.add(getNumber());
        }
    }

    public void minArray() {
        inputArray();
        int min = arr.get(0);
        for (int i = 1; i < number; i++)
            if (min > arr.get(i)) {
                min = arr.get(i);
            }
        System.out.println("Min: " + min);
        arr.clear();
    }

    public void reverseArray() {
        inputArray();
        Collections.reverse(arr);
        System.out.println("Array before reverse sort: " + arr);
        arr.clear();
    }
}