package file;
import model.DanhBa;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class GhiDocFile {
    public static void ghiVaoFile (String path, List<DanhBa> danhBaList) throws IOException {
        File file = new File(path);
        file.createNewFile();
        PrintWriter pw = new PrintWriter(file);
        String str = "số dt, nhom, hote, gioitinh, địa chỉ" +"\n";
        for (DanhBa i: danhBaList) {
            str += i.getsDT() +","+ i.getNhom() +","+ i.getHoTen() +","+ i.getGioiTinh() +","+ i.getDiaChi() +"\n";
        }
        pw.write(str);
        pw.close();
    }

    public static void docTuFile (String path, List<DanhBa> danhBaList) throws IOException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String a = sc.nextLine();
            System.out.println(a);
        }
        sc.close();
    }
}
