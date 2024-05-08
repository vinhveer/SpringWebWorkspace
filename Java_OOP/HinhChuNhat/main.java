package HinhChuNhat;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        hcn.setDai(input.nextDouble());
        System.out.print("Nhap chieu rong: ");
        hcn.setRong(input.nextDouble());
        System.out.println("Chu vi hinh chu nhat la: " + hcn.tinhChuVi());
        System.out.println("Dien tich hinh chu nhat la: " + hcn.tinhDienTich());
    }
}
