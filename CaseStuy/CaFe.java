import java.util.ArrayList;
import java.util.List;

public class CaFe {
    public static void main(String[] args) {

    }
    private String tenQuan;
    private String diaChi;
    private String soDienThoai;
    private List<String> danhSachNhanVien;


    public CaFe(String tenQuan, String diaChi, String soDienThoai) {
        this.tenQuan = tenQuan;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.danhSachNhanVien = new ArrayList<>();
    }
    //gắn get và set cho các thuộc tính
    public String getTenQuan() {
        return tenQuan;
    }
    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getSoDienThoai() {
        return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void suaNhanVien(String tenNhanVienCu, String tenNhanVienMoi) {
        int index = danhSachNhanVien.indexOf(tenNhanVienCu);
        if (index != -1) {
            danhSachNhanVien.set(index, tenNhanVienMoi);
            System.out.println("Đã sửa nhân viên từ " + tenNhanVienCu + " thành " + tenNhanVienMoi);
        } else {
            System.out.println("Nhân viên " + tenNhanVienCu + " không tồn tại.");
        }
    }

    public void xoaNhanVien(String tenNhanVien) {
        boolean removed = danhSachNhanVien.remove(tenNhanVien);
        if (removed) {
            System.out.println("Đã xóa nhân viên: " + tenNhanVien);
        } else {
            System.out.println("Nhân viên " + tenNhanVien + " không tồn tại.");
        }
    }
}

