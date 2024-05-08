package Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Search {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n;

        try {
            System.out.print("N = ");
            n = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Lỗi");
        }
    }
}
