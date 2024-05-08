package Test;

import java.util.Scanner;

public class testSplitString {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("string: ");
        String str = input.nextLine();
        String[] strspl = str.split("");
        for (String strsp: strspl) {
            System.out.println(strsp);
        }
    }
}
