package CanBo;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private String rank;
    public CongNhan(){
    }
    public CongNhan(String rank, String fullName, String dateOfBirth, boolean gender, String address) {
        super(fullName, dateOfBirth, gender, address);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public static Scanner input = new Scanner(System.in);
    public void inputInformation() {
        super.inputInformation(input);
        System.out.print("Rank: ");
        rank = input.nextLine();
    }
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Rank: " + rank);
    }
}
