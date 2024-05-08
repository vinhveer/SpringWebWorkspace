package TITVExample.Summary;

public class Summary {
    public Summary() {
    }

    public int Sum(int a, int b) {
        return a + b;
    }

    public double Sum(double a, double b) {
        return a + b;
    }

    public int Sum(int[] array) {
        int sum = 0;
        for (int value: array) {
            sum += value;
        }
        return sum;
    }

    public double Sum(double[] array) {
        double sum = 0;
        for (double value: array) {
            sum += value;
        }
        return sum;
    }
}
