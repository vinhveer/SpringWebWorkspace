package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
    public static Scanner input = new Scanner(System.in);

    public int number;

    public Number() {
    }

    private int getNumber() {
        while (true) {
            try {
                System.out.print("N = ");
                return input.nextInt();
            }  catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                input.nextLine();
            }
        }
    }

    public void checkNumber() {
        number = getNumber();
        if (this.number < 0) {
            System.out.println("This is a negative number!");
        } else {
            System.out.println("This is a positive number!");
        }
    }

    public void convertNumber() {
        number = getNumber();
        switch (this.number) {
            case 1 -> System.out.println("Một");
            case 2 -> System.out.println("Hai");
            case 3 -> System.out.println("Ba");
            case 4 -> System.out.println("Bốn");
            case 5 -> System.out.println("Năm");
            case 6 -> System.out.println("Sáu");
            case 7 -> System.out.println("Bảy");
            case 8 -> System.out.println("Tám");
            case 9 -> System.out.println("Chín");
            case 10 -> System.out.println("Mười");
            default -> System.out.println("M** biết đouuuuu");
        }
    }

    public void sumOfEvenNumber() {
        number = getNumber();
        long i = 0;
        long sum = 0;
        while (i < this.number) {
            i += 2;
            sum += i;
        }
        System.out.println("Sum of even Number is: " + sum);
    }

    public void printMultipleNumber() {
        number = getNumber();
        for (int i = 0; i <= 20; i++) {
            System.out.println(this.number + " x " + i + " = " + number * i);
        }
    }
}