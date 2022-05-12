package model;

public class Nguoi {
    private String sDT;
    private int nhom;
    private String hoTen;
    private String gioiTinh;
    private String diaChi;

    public Nguoi() {
    }

    public Nguoi(String sDT, int nhom, String hoTen, String gioiTinh, String diaChi) {
        this.sDT = sDT;
        this.nhom = nhom;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public int getNhom() {
        return nhom;
    }

    public void setNhom(int nhom) {
        this.nhom = nhom;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "SĐT = " + sDT  +
                ", Nhóm = " + nhom +
                ", Họ Tên = " + hoTen  +
                ", Giới Tính = " + gioiTinh  +
                ", Địa Chỉ = " + diaChi  +
                '}';
    }
}
