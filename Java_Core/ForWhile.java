public class ForWhile {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        int[] mangSoNguyen = {0, 2, 4, 6, 8, 10};
        for (int soNguyen: mangSoNguyen) {
            System.out.println(soNguyen);
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 5) {
                break;
            } else {
                if (i == 6) {
                    i++;
                } else {
                    continue;
                }
            }
        }
    }
}
