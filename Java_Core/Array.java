public class Array {

    public static void main(String[] args) {
        int[] a;
        int[] b = new int[5];
        int[] grade = {10, 9, 3, 2, 1};
        for (int gra: grade) {
            System.out.println(gra);
        }
        for (int i = 0; i < grade.length; i++) {
            System.out.println(i);
        }
    }
}
