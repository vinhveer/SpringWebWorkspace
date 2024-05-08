package TITVExample;

public class main {
    public static void main(String[] args) {
        int day, month, year;
        myDate date1 = new myDate(30, 7, 2004);
        myDate date2 = new myDate(20, 5, 2000);
        myDate date3 = new myDate(29, 7, 2003);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        System.out.println(date1.equals(date2));
        System.out.println(date2.hashCode());
    }
}
