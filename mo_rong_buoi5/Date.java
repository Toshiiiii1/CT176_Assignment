package mo_rong_buoi5;

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

    // ham day dung sao chep
    public Date(Date date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    // hien thi ngay thang nam
    public void in() {
        System.out.printf("%02d/%02d/%d\n", day, month, year);
    }

    // ham tra ve chuoi in ngay thang nam
    public String toString() {
        return day + "/" + month + "/" + year;
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
            System.out.print("-- Nhap ngay: ");
            day = sc.nextInt();
            System.out.print("-- Nhap thang: ");
            month = sc.nextInt();
            System.out.print("-- Nhap nam: ");
            year = sc.nextInt();
        } while (!hopLe());
    }

    public static void main(String[] args) {
        
    }
}
