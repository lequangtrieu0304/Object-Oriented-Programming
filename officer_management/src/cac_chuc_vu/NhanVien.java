package cac_chuc_vu;

public class NhanVien extends CanBo{
    private String task;
    public NhanVien(String name, int age, GioiTinh gioiTinh, String address, String task) {
        super(name, age, gioiTinh, address);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "task='" + task + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gioiTinh=" + gioiTinh +
                ", address='" + address + '\'' +
                '}';
    }
}
