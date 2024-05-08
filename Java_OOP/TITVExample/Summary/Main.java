package TITVExample.Summary;

public class Main {
    public static void main(String[] args) {
        Summary summary = new Summary();
        System.out.println("2 + 3 = " + summary.Sum(2, 3));
        System.out.println("2.5 + 3.6 = " + summary.Sum(2.5, 3.6));
        int[] array = {2, 3, 4, 5};
        System.out.println("Sum of {2, 3, 4, 5} = " + summary.Sum(array));
        double[] doublearray = {2.5, 3.6, 4.7, 5.8};
        System.out.println("Sum of {2.5, 3.6, 4.7, 5.8} = " + summary.Sum(doublearray));
    }
}
