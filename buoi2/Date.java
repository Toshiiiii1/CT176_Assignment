package buoi2;

import java.util.Scanner;

public class Date {
    private int day, month, year;

    // ham xay dung mac nhien
    public Date() {
        day = 0;
        month = 0;
        year = 0;
    }

    // ham xay dung co ba tham so
    public Date(int day1, int month1, int year1) {
        day = day1;
        month = month1;
        year = year1;
    }

    // hien thi ngay thang nam
    public void hienThi() {
        System.out.printf("%02d/%02d/%d\n", day, month, year);
    }

    // kiem tra ngay hop le
    public boolean hopLe() {
        int max[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean flag = false;
        if ((year %4 == 0 && year %100 != 0) || year % 400 == 0)
            max[2] = 29;
        if (year > 0 && month > 0 && month <= 12 && day > 0 && day <= max[month])
            flag = true;

        return flag;
    }

    // nhap ngay, thang, nam tu ban phim
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap ngay: ");
            day = sc.nextInt();
            System.out.print("Nhap thang: ");
            month = sc.nextInt();
            System.out.print("Nhap nam: ");
            year = sc.nextInt();
        } while (!hopLe());
    }

    // tinh ngay hom sau
    public Date ngayHomSau() {
        Date temp = new Date(day, month, year);
        temp.day++;
        if (!temp.hopLe()) {
            temp.day = 1;
            temp.month++;
            if (!temp.hopLe()) {
                temp.month = 1;
                temp.year++;
            }
        }
        return temp;
    }

    // tinh ngay sau N ngay
    public Date congNgay(int n) {
        Date temp = new Date(day, month, year);
        int i;
        for (i=1; i <= n; i++)
            temp = temp.ngayHomSau();

        return temp;
    }

    public static void main(String[] args) {
        
    }
}
