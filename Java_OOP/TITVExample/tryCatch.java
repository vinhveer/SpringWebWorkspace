package TITVExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("N = ");
        try {
            int n = input.nextInt();
            System.out.println("So vua nhap la: " + n);
        } catch (InputMismatchException e) {
            System.out.println("Chuong trinh bi loi");
        } finally {
            System.out.println("Cau lenh nay luon duoc thuc thi!");
        }
    }
}