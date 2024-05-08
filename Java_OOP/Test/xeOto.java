package Test;

public class xeOto {
    String thuongHieu;
    xeOto (String thuongHieu) {
        this.thuongHieu = thuongHieu;
        System.out.println(thuongHieu);
    }


    public static void main(String[] args) {
        System.out.println("Program is starting ...");
        xeOto obect = new xeOto("tesla");
    }
}
