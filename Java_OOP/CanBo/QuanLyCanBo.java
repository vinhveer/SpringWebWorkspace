package CanBo;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
    public static ArrayList<CanBo> canBoArrayList = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int control;
        System.out.println("Chọn: ");
        System.out.println("1. Công Nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        control = input.nextInt();

        CanBo canbo = new CanBo();
        switch (control) {
            case 1 -> canbo = new CongNhan();
            case 2 -> canbo = new KySu();
            case 3 -> canbo = new NhanVien();
            default -> {}
        }
        canbo.inputInformation(input);
        canBoArrayList.add(canbo);
        canbo.displayInformation();
    }
}
