package input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CkeckRegex {

    public String checkSoDT () {
        Scanner sc = new Scanner(System.in);
        String soDT = "";
        while (true) {
            System.out.println("Nhập vào số điện thoại");
            System.out.println(ANSI_RED + "Note: Số điện thoại phải bắt đầu từ 0 và số lượng số trong khoảng (6-11)" + ANSI_RESET);
            soDT = sc.nextLine();
            Pattern pSo = Pattern.compile("^.*[0]+.*$");
            Pattern pDoDai = Pattern.compile("^.{6,11}$");

            if (pSo.matcher(soDT).find() && pDoDai.matcher(soDT).find()) {
                break;
            } else {
                System.out.println(ANSI_RED + "Nhập số điện thoại không đúng!" + ANSI_RESET);
            }
        }
        return soDT;
    }

    public String checkEmail () {
        Scanner sc = new Scanner(System.in);
        String mail = "";
        while (true) {
            System.out.println("Nhập vào email");
            System.out.println(ANSI_RED + "(Note: Phải bắt đầu là chữ cái)" + ANSI_RESET);
            mail = sc.nextLine();
            Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z]+(\\.[a-zA-Z]+)+$");

            if (p.matcher(mail).find()) {
                break;
            } else {
                System.out.println(ANSI_RED + "Nhập email không đúng!" + ANSI_RESET);
            }
        }
        return mail;
    }


    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

}
