package Practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentID {
    public static Scanner input = new Scanner(System.in);

    public StudentID() {
    }

    private String[] studentIDs = new String[5];

    private void enterStudentID() {
        System.out.println("Enter Student ID: ");
        this.studentIDs = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter studentID for student " + (i+1) + ": ");
            studentIDs[i] = input.nextLine();
        }
    }

    public void checkStudentID(String regex, String studentID) {
        boolean isValidStudentID;
        Pattern datePattern = Pattern.compile(regex);
        Matcher matcher = datePattern.matcher(studentID);
        isValidStudentID = matcher.matches();
        if (!isValidStudentID) {
            System.out.println("Invalid StudentID format.");
        } else {
            System.out.println("Valid StudentID format!");
        }
    }

    public void Exercise6() {
        enterStudentID();
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + i + ": ");
            checkStudentID("B170\\d{4}", studentIDs[i]);
        }
    }

    public void Exercise7() {
        enterStudentID();
        for (int i = 0; i < 5; i++){
            System.out.print("Student " + i + ": ");
            checkStudentID("00[2-5]L\\d{3}",studentIDs[i]);
        }
    }
}
