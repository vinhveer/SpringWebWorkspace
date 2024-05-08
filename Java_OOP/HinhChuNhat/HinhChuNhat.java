package HinhChuNhat;

public class HinhChuNhat {
    double dai, rong;

/*  public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
 */
    public HinhChuNhat() {
    }

/*  public double getRong() {
        return rong;
    }

    public double getDai() {
        return dai;
    }
*/
    public void setRong(double rong) {
        this.rong = rong;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    double tinhDienTich() {
        return dai * rong;
    }

    double tinhChuVi() {
        return (dai + rong) * 2;
    }
}
