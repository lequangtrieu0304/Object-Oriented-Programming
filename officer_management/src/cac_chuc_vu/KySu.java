package cac_chuc_vu;

public class KySu extends CanBo {
    private String branch;
    public KySu(String name, int age, GioiTinh gioiTinh, String address, String branch) {
        super(name, age, gioiTinh, address);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "branch='" + branch + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gioiTinh=" + gioiTinh +
                ", address='" + address + '\'' +
                '}';
    }
}
