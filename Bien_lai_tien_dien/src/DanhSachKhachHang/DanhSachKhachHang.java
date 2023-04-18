package DanhSachKhachHang;

import entities.KhachHang;

import java.util.ArrayList;
import java.util.List;

public class DanhSachKhachHang {
    private List<KhachHang> khachHangs;

    public DanhSachKhachHang() {
        this.khachHangs = new ArrayList<>();
    }
    public void addKhachHang(KhachHang khachHang){
        this.khachHangs.add(khachHang);
    }
    public void deleteKhachHang(String name){
        KhachHang khachHang = searchKhachHang(name);
        if(khachHang != null){
            this.khachHangs.remove(khachHang);
            System.out.println("Xóa thành công");
        }
        System.out.println("Không tìm thấy khách hàng");
    }
//    public void updateKhachHang(String name, String soNha, String maSo){
//        KhachHang khachHang = this.khachHangs
//                .stream()
//                .filter(k -> k.getName().equals(name))
//                .findFirst()
//                .orElse(null);
//        if(khachHang != null){
//            khachHang.setSoNha(soNha);
//        }
//    }

    public KhachHang searchKhachHang(String name){
        KhachHang khachHang = this.khachHangs
                .stream()
                .filter(k -> k.getMaSo().equals(name))
                .findFirst()
                .orElse(null);
        if(khachHang != null){
            return khachHang;
        }
        return null;
    }
    public void showLists(){
        this.khachHangs.forEach(k -> System.out.println(k.toString()));
    }
}
