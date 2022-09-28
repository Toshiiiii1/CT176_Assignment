package buoi3;

import java.util.Scanner;
import static java.lang.Math.*;

public class Diem {

    private int x, y;
    
    // ham xay dung mac nhien
    public Diem() {
        x = 0;
        y = 0;
    }

    // ham xay dung co hai tham so
    public Diem(int x1, int y1) {
        x = x1;
        y = y1;
    }
    
    // ham xay dung sao chep
    public Diem(Diem d) {
        this.x = d.x;
        this.y = d.y;
    }

    // nhap toa do cho diem tu ban phim
    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao toa do diem X: ");
        x = sc.nextInt();
        System.out.print("Nhap vao toa do diem Y: ");
        y = sc.nextInt();
    }

    // hien thi toa do diem
    public void hienThi() {
        System.out.printf("(%d %d)", x, y);
    }

    // tra ve chuoi in toa do cua diem
    public String toString() {
        return "(" + this.giaTriX() + ", " + this.giaTriY() + ")";
    }

    // doi diem di 1 do doi
    public void doiDiem(int dx, int dy) {
        x += dx;
        y += dy;
    }

    // lay ra gia tri hoanh do cua diem
    public int giaTriX() {
        return x;
    }

    // lay ra gia tri tung do cua diem
    public int giaTriY() {
        return y;
    }

    // tinh khoang cach tu 1 diem den goc toa do
    public float khoangCach() {
        return (float)Math.sqrt(x*x + y*y);
    }

    // tinh khoang cach giua hai diem
    public float khoangCach(Diem B) {
        return (float)Math.sqrt(Math.pow(x - B.x, 2) + Math.pow(y - B.y, 2));
    }

    // ham tinh tien 1 diem
    public void tinhTien(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    public static void main(String[] args) {
        
    }
}