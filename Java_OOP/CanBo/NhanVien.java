package CanBo;

public class NhanVien extends CanBo{
    public NhanVien(String fullName, String dateOfBirth, boolean gender, String address, String job) {
        super(fullName, dateOfBirth, gender, address);
        this.job = job;
    }

    public NhanVien() {
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String job;

}
