package Practice;

import java.util.Scanner;

public class singleString {
    public static Scanner input = new Scanner(System.in);
    private String[] strings;
    private String keyword;

    private void enterString() {
        System.out.print("Nhập chuỗi ký tự: ");
        String string = input.nextLine();
        strings = string.split("");
        do {
            System.out.print("Nhập từ khoá (1 ký tự): ");
            keyword = input.nextLine();
            if (keyword.length() > 1) {
                System.out.println("Từ khoá chỉ bao gồm 1 ký tự");
            }
        } while (keyword.length() > 1);
    }

    public void findKeyword() {
        enterString();
        boolean check = false;
        for (String str: strings)
            if (str.equals(keyword)) {
                check = true;
                break;
            }
        if (check)
            System.out.println("Có");
        else
            System.out.println("Không");
    }
}
