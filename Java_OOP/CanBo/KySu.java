package CanBo;

public class KySu extends CanBo {
    public String getEduField() {
        return eduField;
    }

    public void setEduField(String eduField) {
        this.eduField = eduField;
    }

    public KySu(String fullName, String dateOfBirth, boolean gender, String address, String eduField) {
        super(fullName, dateOfBirth, gender, address);
        this.eduField = eduField;
    }

    public KySu() {
    }

    private String eduField;

}
