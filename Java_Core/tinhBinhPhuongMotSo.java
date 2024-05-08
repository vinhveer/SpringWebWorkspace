import java.util.Scanner;
public class tinhBinhPhuongMotSo {
    public static Scanner scanner = new Scanner(System.in);

    private static int tinhTong(int i, int j) {
        return i + j;
    }

    private static int tinhTich(int i, int j) {
        return i * j;
    }
    public static void main(String[] args) {
        int n;
        System.out.print("N = ");
        n = scanner.nextInt();
        System.out.println("Ket qua la: " + tinhBinhPhuong(n));
        System.out.println("10 + 20 = " + tinhTong(10, 20));
        System.out.println("10 * 20 = " + tinhTich(10, 20));
    }

    static int tinhBinhPhuong(int i) {
        return i*i;
    }
}
