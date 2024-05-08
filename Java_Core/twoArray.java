public class twoArray {
    public static void main(String[] args) {
        int a[][];
        int b[][] = new int[5][5];
        int c[][] = {{2, 3, 4}, {3, 4, 5}, {3}};

        for (int[] mangCon: c) {
            for (int so: mangCon) {
                System.out.print(so + " ");
            }
            System.out.println();
        }
    }
}
