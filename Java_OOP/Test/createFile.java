package Test;

import java.io.*;
import java.util.*;

public class createFile {
    public static Scanner input = new Scanner(System.in);

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
        clearScreen();
        String fileName, control;
        System.out.print("Input file name: ");
        fileName = input.nextLine() + ".txt";

        File myFile = new File(fileName);
        try {
            if (myFile.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists!");
            }
        } catch (Exception e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
        System.out.print("Can you delete " + fileName + " ? (y/n): ");
        control = input.next();
        System.out.println(control);
        if (control.equals("y")) {
            if (myFile.delete()) {
                System.out.println("File is delete");
            } else {
                System.out.println("Can't delete");
            }
        }
    }
}
