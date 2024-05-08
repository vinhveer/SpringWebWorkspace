package demoOOP;
class Den {
    private boolean denSang; //private: Access specifiers

    public void batDen() {
        denSang = true;
    }

    public void tatDen() {
        denSang = false;
    }

    public void thongBao() {
        if (denSang == true) {
            System.out.println("Đèn đang sáng!");
        } else {
            System.out.println("Đèn đang tắt!");
        }
    }
}
public class doiTuongDen {
    public static void main(String[] args) {
        Den den = new Den();

        den.batDen();
        den.thongBao();

        den.tatDen();
        den.thongBao();
    }
}
