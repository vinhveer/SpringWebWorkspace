import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = a;
        a[3] = 10;
        System.out.println("Mảng a sau khi thay đổi giá trị: " + Arrays.toString(a));
        System.out.println("Mảng b sau khi thay đổi giá trị: " + Arrays.toString(b));
        int[] c = new int[6];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int value: c) {
            System.out.print(value + " ");
        }
    }
}
