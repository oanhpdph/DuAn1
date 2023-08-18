package viewModel;

public class DichVu {

    private String maDv;
    private String soPhong;
    private String dichVu;
    private String maHd;
    private String ngaySd;
    private String soLan;
    private String giamGia;
    private String gia;
    private String thanhTien;

    public DichVu() {
    }

    public DichVu(String maDv, String soPhong, String dichVu, String maHd, String ngaySd, String soLan, String giamGia, String gia, String thanhTien) {
        this.maDv = maDv;
        this.soPhong = soPhong;
        this.dichVu = dichVu;
        this.maHd = maHd;
        this.ngaySd = ngaySd;
        this.soLan = soLan;
        this.giamGia = giamGia;
        this.gia = gia;
        this.thanhTien = thanhTien;
    }

    public String getMaDv() {
        return maDv;
    }

    public void setMaDv(String maDv) {
        this.maDv = maDv;
    }

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public String getDichVu() {
        return dichVu;
    }

    public void setDichVu(String dichVu) {
        this.dichVu = dichVu;
    }

    public String getMaHd() {
        return maHd;
    }

    public void setMaHd(String maHd) {
        this.maHd = maHd;
    }

    public String getNgaySd() {
        return ngaySd;
    }

    public void setNgaySd(String ngaySd) {
        this.ngaySd = ngaySd;
    }

    public String getSoLan() {
        return soLan;
    }

    public void setSoLan(String soLan) {
        this.soLan = soLan;
    }

    public String getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(String giamGia) {
        this.giamGia = giamGia;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(String thanhTien) {
        this.thanhTien = thanhTien;
    }

    
}
