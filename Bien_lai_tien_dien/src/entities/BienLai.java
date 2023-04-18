package entities;

public class BienLai {
    private KhachHang khachHang;
    private int soMoi;
    private int soCu;
    private int tongTien;

    public BienLai(KhachHang khachHang, int soMoi, int soCu) {
        this.khachHang = khachHang;
        this.soMoi = soMoi;
        this.soCu = soCu;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public int getSoMoi() {
        return soMoi;
    }

    public void setSoMoi(int soMoi) {
        this.soMoi = soMoi;
    }

    public int getSoCu() {
        return soCu;
    }

    public void setSoCu(int soCu) {
        this.soCu = soCu;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "BienLai{" +
                "khachHang=" + khachHang +
                ", soMoi=" + soMoi +
                ", soCu=" + soCu +
                ", tongTien=" + tongTien +
                '}';
    }
    public int tinhTongTien(){
        this.tongTien = (this.soMoi - this.soCu) * 5;
        return tongTien;
    }
}
