package Test;

import java.util.Scanner;
public class import1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void inputArray(int n, int[] arr) {

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void outputArray(int n, int[] arr) {
        System.out.print("The array is: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static int maxNegativeInteger(int n, int[] arr) {
        int max_negative = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0)
                if (arr[i] > max_negative)
                    max_negative = arr[i];
        }
        return max_negative;
    }

    public static void sortArray(int n, int[] arr) {
        int intersection = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < 0 && arr[i] >= 0) {
                intersection = i;
            }
        }
        for (int i = 0; i < intersection; i++) {
            for (int j = i + 1; j < intersection; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = intersection; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


    }

    public static void main(String[] args) {
        int n;
        int[] arr = new int[100];
        do {
            System.out.print("N = ");
            n = scanner.nextInt();
        } while (n < 3 || n > 100);

        inputArray(n, arr);
        outputArray(n, arr);

        System.out.println("Max negative: " + maxNegativeInteger(n, arr));
        sortArray(n, arr);
        outputArray(n, arr);
    }
}
