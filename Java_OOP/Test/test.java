package Test;

import java.util.Scanner;
public class test {
    private static Scanner scanner = new Scanner(System.in);
    private static void Input(int n) {
        System.out.println("N = ");
        n = scanner.nextInt();
    }
    public static void main(String[] args) {
        int n = 0;
        Input(n);
        System.out.println(n);
    }
}
