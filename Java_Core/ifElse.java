public class ifElse {
    public static void main(String[] args) {
        int a = 10;
        if (a > 10) {
            System.out.println("Con catx");
        } else {
            System.out.println("Meo");
        }

        int day = 3;
        if (day == 1) {
            System.out.println("Ngay 1");
        } else if (day == 2) {
            System.out.println("Ngay 2");
        } else if (day == 3) {
            System.out.println("Ngay 3");
        } else {
            System.out.println("Deo biet");
        }
        int day1 = 2, day2 = 3;
        if (day1 == 2) {
            if (day2 == 3) {
                System.out.println("Dung ...");
            }
        }

        switch (day1) {
            case 1:
                System.out.println("Day 1");
                break;
            default:
                System.out.println("deo biet");
                break;
        }
    }
}
