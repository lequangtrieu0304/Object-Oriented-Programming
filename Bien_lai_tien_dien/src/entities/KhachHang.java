package entities;
public class KhachHang {
    private String name;
    private String soNha;
    private String maSo;

    public KhachHang(String name, String soNha, String maSo) {
        this.name = name;
        this.soNha = soNha;
        this.maSo = maSo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "name='" + name + '\'' +
                ", soNha='" + soNha + '\'' +
                ", MaSo='" + maSo + '\'' +
                '}';
    }
}
