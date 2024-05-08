package Test;

public class Test2 {
    int data;
    Test2 (int dataValue) {
        data = dataValue;
    }
    public static void swap(Test2 n1, Test2 n2) {
        System.out.println("\tGia tri cac bien ben trong ham swap");
        System.out.println("\t\tTruoc khi swap, n1.data = " + n1.data + " va n2.data = " + n2.data);
        // Swap n1.data with n2.data
        int temp = n1.data;
        n1.data = n2.data;
        n2.data = temp;
        System.out.println("\t\tSau khi swap, n1.data = " + n1.data + " va n2.data = " + n2.data);
    }
    public static void main(String[] args) {
        Test2 n1 = new Test2(1);
        Test2 n2 = new Test2(2);
        System.out.println("Truoc khi goi ham swap, n1.data = " + n1.data + " va n2.data = " + n2.data);
        swap(n1, n2);
        System.out.println("Sau khi goi ham swap, n1.data = " + n1.data + " va n2.data = " + n2.data);
    }
}
