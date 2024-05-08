import java.util.Scanner;

public class import3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void Input(int n, float[] a) {
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("a[" + i + "] = ");
                a[i] = scanner.nextInt();
                if (a[i] < 5 || a[i] > 20) {
                    System.out.println("The limit value is within the range of 5 between 20. Please try again!");
                }
            } while (a[i] < 5 || a[i] > 20);
        }
    }

    public static void Output(int n, float[] a) {
        System.out.println("The sequence of values is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void MaxElement(int n, float[] a) {
        int posmax = 0;
        float max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] >= max) {
                max = a[i];
                posmax = i;
            }
        }
        System.out.println("Max = " + max + " ; Position = " + posmax);
    }

    public static float AvgArr(int n, float[] a) {
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return (sum / ((float)n));
    }

    public static void main(String[] args) {
        int n;
        float[] a = new float[100];
        do {
            System.out.print("N = ");
            n = scanner.nextInt();
            if (n < 3 || n > 100) {
                System.out.println("The limit value is within the range of 3 >= n <= %d. Please try again!");
            }
        } while (n < 3 || n > 100);

        Input(n, a);
        Output(n, a);
        MaxElement(n, a);
        System.out.println("Average: " + AvgArr(n, a));
    }
}