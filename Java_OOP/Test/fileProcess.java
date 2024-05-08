package Test;

import java.io.*;
import java.util.*;

public class fileProcess {
    String data;
    fileProcess(String dataValue) {
        data = dataValue;
    }

    public static Scanner input = new Scanner(System.in);

    public static void createFile(fileProcess fileName) {
        System.out.print("Input file name: ");
        fileName.data = input.nextLine() + ".txt";

        File myFile = new File(fileName.data);
        try {
            if (myFile.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File aready exists!");
            }
        } catch (Exception e) {
            System.out.println("An error occured!");
            e.printStackTrace();
        }
    }

    public static void deleteFile(fileProcess fileName, fileProcess control) {
        System.out.println("Can you delete " + fileName.data + " ? (y/n): ");
        control.data = input.nextLine();
        File myFile = new File(fileName.data);

        if (control.data.equals("y")) {
            if (myFile.delete()) {
                System.out.println("File is deleted!");
            } else {
                System.out.println("Can't deleted!");
            }
        }
    }

    public static void readFile(fileProcess fileName, fileProcess control) {
        try {
            File myFile = new File(fileName.data);
            input = new Scanner(myFile);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        fileProcess fileName = new fileProcess("");
        fileProcess control = new fileProcess("");

        createFile(fileName);
        deleteFile(fileName, control);
        readFile(fileName, control);

    }
}
