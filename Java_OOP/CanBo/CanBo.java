package CanBo;

import java.util.Scanner;

public class CanBo {
    private String fullName;
    private String dateOfBirth;
    private boolean gender;
    private String address;

    public CanBo(String fullName, String dateOfBirth, boolean gender, String address) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
    }

    public CanBo(){
    }

    public String getFullName() {
        return fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInformation(Scanner input) {
        System.out.println("Enter Full-name: ");
        fullName = input.nextLine();
        System.out.println("Enter Date Of Birth: ");
        dateOfBirth = input.nextLine();
        System.out.println("Enter gender: ");
        gender = input.hasNext();
        System.out.println("Enter address: ");
        address = input.nextLine();
    }

    public void displayInformation() {
        System.out.println("Full-name: " + fullName);
        System.out.println("Date Of Birth: " + dateOfBirth);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
    }
}
