import java.util.Scanner;

public class import1 {
    public static Scanner scanner = new Scanner(System.in);

/*  public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i*i <=n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
*/
    public static void inputArray(int[] arr) {
        System.out.println("Enter " + arr.length + "elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void outputArray(int[] arr) {
        System.out.print("The array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        inputArray(arr);
        outputArray(arr);
    }
}
