package cac_chuc_vu;

public class CongNhan extends CanBo {

    private BacCongNhan bacCongNhan;
    public CongNhan(String name, int age, GioiTinh gioiTinh, String address, BacCongNhan bacCongNhan) {
        super(name, age, gioiTinh, address);
        this.bacCongNhan = bacCongNhan;
    }

    public BacCongNhan getBacCongNhan() {
        return bacCongNhan;
    }

    public void setBacCongNhan(BacCongNhan bacCongNhan) {
        this.bacCongNhan = bacCongNhan;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bacCongNhan=" + bacCongNhan +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gioiTinh=" + gioiTinh +
                ", address='" + address + '\'' +
                '}';
    }
}
