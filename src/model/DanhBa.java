package model;

public class DanhBa extends Nguoi {
    private String ngaySinh;
    private String email;

    public DanhBa() {
    }

    public DanhBa(String sDT, int nhom, String hoTen, String gioiTinh, String diaChi, String ngaySinh, String email) {
        super(sDT, nhom, hoTen, gioiTinh, diaChi);
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DanhBa{" +
                "SĐT = " + getsDT()  +
                ", Nhóm = " + getNhom()+
                ", Họ Tên = " + getHoTen()  +
                ", Giới Tính = " + getGioiTinh()  +
                ", Địa Chỉ = " + getDiaChi() +
//                ", NgàySinh = " + ngaySinh  +
//                ", Email = " + email  +
                '}';
    }
}
