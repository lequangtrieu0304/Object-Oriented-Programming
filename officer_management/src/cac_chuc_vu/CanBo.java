package cac_chuc_vu;

public class CanBo {
    protected String name;
    protected int age;
    protected GioiTinh gioiTinh;
    protected String address;

    public CanBo(String name, int age, GioiTinh gioiTinh, String address) {
        this.name = name;
        this.age = age;
        this.gioiTinh = gioiTinh;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GioiTinh getGender() {
        return gioiTinh;
    }

    public void setGender(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
