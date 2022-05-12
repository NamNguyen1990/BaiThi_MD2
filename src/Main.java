import manage.QuanLyDanhBa;
import model.DanhBa;
import input.CkeckRegex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyDanhBa quanLyDanhBa = new QuanLyDanhBa();
        CkeckRegex ckeckRegex = new CkeckRegex();
        Scanner sc = new Scanner(System.in);
        Scanner nhapChu = new Scanner(System.in);
        Scanner nhapChu1 = new Scanner(System.in);

        int luaChon = -1;

        System.out.println("===Chương trình quản lý danh bạ===");
        System.out.println("Chọn chức năng theo số (để tiếp tục):");
        System.out.println("1 - Xem danh sách");
        System.out.println("2 - Thêm mới");
        System.out.println("3 - Cập nhật");
        System.out.println("4 - Xóa!");
        System.out.println("5 - Tìm kiếm");
        System.out.println("6 - Đọc từ File");
        System.out.println("7 - Ghi vào File");
        System.out.println("8 - Xem lại Chương trình");
        System.out.println("9 - Thoát");

        do {
            System.out.println("Mời bạn chọn chức năng");
            System.out.println(ANSI_RED + "Note: Nhấn 8 Xem lại Chương trình" + ANSI_RESET);

            boolean check0 = false;
            while (!check0) {
                try {
                    luaChon = sc.nextInt();
                    if (luaChon < 1 || luaChon > 9) throw new Exception();
                    check0 = true;
                } catch (InputMismatchException e) {
                    System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println(ANSI_RED + "Chỉ được nhập số từ 0 --> 9" + ANSI_RESET);
                }
            }

            if (luaChon == 1) {
                quanLyDanhBa.hienThi();
            }
            else if (luaChon == 2) {
                String sDT = ckeckRegex.checkSoDT();
                int nhom = -1;
                boolean check1 = false;
                while (!check1) {
                    System.out.println("Nhập vào nhóm");
                    try {
                        nhom = sc.nextInt();
                        check1 = true;
                    } catch (Exception e) {
                        System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                        sc.nextLine();
                    }
                }
                System.out.println("Nhập vào họ tên");
                String hoTen = nhapChu.nextLine();
                System.out.println("Nhập giới tính");
                String gioiTinh = nhapChu.nextLine();
                System.out.println("Nhập vào địa chỉ");
                String diaChi = nhapChu.nextLine();
                System.out.println("Nhập vào ngày sinh");
                String ngaySinh = nhapChu.nextLine();
                String email = ckeckRegex.checkEmail();

                DanhBa danhBa = new DanhBa(sDT,nhom,hoTen,gioiTinh,diaChi,ngaySinh,email);
                quanLyDanhBa.them(danhBa);
            }
            else if (luaChon == 3) {
                System.out.println("Nhập vào số ĐT muốn sửa!");
                String soDTS = nhapChu.nextLine();
                System.out.println("Nhập nhóm mới");
                int nhomS = -1;
                boolean check2 = false;
                while (!check2) {
                    System.out.println("Nhập vào nhóm mới");
                    try {
                        nhomS = sc.nextInt();
                        check2 = true;
                    } catch (Exception e) {
                        System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                        sc.nextLine();
                    }
                }
                System.out.println("Nhập vào họ tên mới");
                String hoTenS = nhapChu.nextLine();
                System.out.println("Nhập giới tính mới");
                String gioiTinhS = nhapChu.nextLine();
                System.out.println("Nhập vào địa chỉ mới");
                String diaChiS = nhapChu.nextLine();
                System.out.println("Nhập vào ngày sinh sửa");
                String ngaySinhS = nhapChu.nextLine();
                System.out.println("Sửa email thành");
                String emailS = ckeckRegex.checkEmail();

                DanhBa danhBa1 = new DanhBa(soDTS,nhomS,hoTenS,gioiTinhS,diaChiS,ngaySinhS,emailS);
                quanLyDanhBa.suaDanhBa(soDTS,danhBa1);

            }
            else if (luaChon == 4) {
                System.out.println("Nhập vào số ĐT muốn xóa!");
                String soDTX = nhapChu.nextLine();
                System.out.println("Bạn có muốn xóa Danh bạ này khỏi danh sách không?" + ANSI_RED + "[Chọn: Y(Yes)/N(No)]" + ANSI_RESET);
                char result, a = 'Y', b = 'N';
                result = nhapChu1.next().charAt(0);
                if (result == a) {
                    quanLyDanhBa.xoaDanhBa(soDTX);
                }
                if (result == b) {
                    System.exit(0);
                }
            }
            else if (luaChon == 5) {
                System.out.println("Nhập số điện thoại cần tìm!");
                String soDT = nhapChu.nextLine();
                quanLyDanhBa.timSDTGanDung(soDT);
            }
            else if (luaChon == 6) {

            }
            else if (luaChon == 7) {

            }
            else if (luaChon == 8) {

                System.out.println("===Chương trình quản lý danh bạ===");
                System.out.println("Chọn chức năng theo số (để iếp tục):");
                System.out.println("1 - Xem danh sách");
                System.out.println("2 - Thêm mới");
                System.out.println("3 - Cập nhật");
                System.out.println("4 - Xóa!");
                System.out.println("5 - Tìm kiếm");
                System.out.println("6 - Đọc từ File");
                System.out.println("7 - Ghi vào File");
                System.out.println("8 - Xem lại Chương trình");
                System.out.println("9 - Thoát");

            }

        } while (luaChon != 9);

    }






    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
}
