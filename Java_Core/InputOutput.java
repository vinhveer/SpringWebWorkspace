import java.util.Scanner;

public class InputOutput {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hay nhap Ho va ten: ");
        String name = input.nextLine();
        System.out.print("Hay nhap Tuoi: ");
        int age = scanner.nextInt();
        System.out.print("Hay nhap So diem: ");
        float grade = input.nextFloat();

        System.out.println("Ten cua ban la: " + name);
        System.out.println("Tuoi cua ban la: " + age);
        System.out.println("Diem cua ban la: " + grade);
    }
}
