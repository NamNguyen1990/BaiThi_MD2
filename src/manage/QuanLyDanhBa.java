package manage;

import model.DanhBa;

import java.util.ArrayList;
import java.util.List;

public class QuanLyDanhBa {
    List<DanhBa> danhBaList = new ArrayList<>();

    public void them(DanhBa danhBa) {
        danhBaList.add(danhBa);
        System.out.println(ANSI_BLUE + "Bạn đã thêm thành công 1 danh bạ mới" + ANSI_RESET);
    }
    public void hienThi() {
        boolean check = false;
        for (int i=0; i<danhBaList.size(); i++) {
            System.out.println(danhBaList.get(i));
            check = true;
        }
        if (check == false) {
            System.out.println(ANSI_RED + "Chưa có danh bạ nào được thêm mới!" + ANSI_RESET);
        }
    }

    public int timSDT (String soDT) {
        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).getsDT().equals(soDT)) {
                return i;
            }
        }
        return -1;
    }

    public void suaDanhBa (String soDT, DanhBa danhBa) {
        int indexOf = timSDT(soDT);
        if (indexOf == -1) {
            System.out.println(ANSI_RED + "Không tìm được số ĐT nào như trên" + ANSI_RESET);
        } else {
            danhBaList.set(indexOf, danhBa);
            System.out.println(ANSI_BLUE + "Bạn đã sửa thành công thông tin danh bạ" + ANSI_RESET);
        }
    }

    public void xoaDanhBa (String soDT) {
        int indexOf = timSDT(soDT);
        if (indexOf == -1) {
            System.out.println(ANSI_RED + "Không có số ĐT nào như trên" + ANSI_RESET);
        } else {
            danhBaList.remove(indexOf);
            System.out.println(ANSI_BLUE + "Bạn đã xóa thành công thông tin số danh bạ trên!" + ANSI_RESET);
        }
    }

    public  void timSDTGanDung (String sDT) {
        boolean check = false;
        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).getsDT().contains(sDT)) {
                System.out.println(danhBaList.get(i));
                check = true;
            }
        }
        if (check == false) {
            System.out.println(ANSI_RED + "Không có số điện thoại nào như trên!" + ANSI_RESET);
        }
    }











    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
}
