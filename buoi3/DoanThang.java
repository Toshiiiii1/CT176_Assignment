package buoi3;

import java.util.Scanner;
import java.lang.Math;

public class DoanThang {
    private Diem d1, d2;
    
    // ham xay dung mac nhien
    public DoanThang() {
        d1 = new Diem();
        d2 = new Diem();
    }

    // ham xay dung co 4 tham so kieu int
    public DoanThang(int a, int b, int c, int d) {
        d1 = new Diem(a, b);
        d2 = new Diem(c, d);
    }

    // ham xay dung co 2 tham so kieu Diem
    public DoanThang(Diem d1, Diem d2) {
        this.d1 = new Diem(d1);
        this.d2 = new Diem(d2);
    }

    // ham xay dung sao chep
    public DoanThang(DoanThang d) {
        this.d1 = new Diem(d.d1);
        this.d2 = new Diem(d.d2);
    }

    // ham in
    public void hienThi() {
        System.out.println("[" + d1 + ", " + d2 + "]");
    }

    // ham tra ve chuoi in toa do 2 diem cua doan thang
    public String toString() {
        return ("[" + d1 + ", " + d2 + "]");
    }

    // ham nhap
    public void nhap() {
        System.out.println("Nhap toa do diem dau tien:");
        this.d1.nhapDiem();
        System.out.println("----------");
        System.out.println("Nhap toa do diem thu hai:");
        this.d2.nhapDiem();
    }

    // ham tinh tien
    public void tinhTien(int dx, int dy) {
        this.d1.tinhTien(dx, dy);
        this.d2.tinhTien(dx, dy);
    }

    // ham tinh do dai doan thang
    public float doDai() {
        return (float)(Math.sqrt(Math.pow(this.d2.giaTriX() - this.d1.giaTriX(), 2) + Math.pow(this.d2.giaTriY() - this.d1.giaTriY(), 2)));
    }

    // ham tinh goc giua doan thang va truc Ox
    public int tinhGoc() {
        /* - toaDoXVecto: toa do X trong vecto chi phuong cua doan thang
           - toaDoYVecto: toa do Y trong vecto chi phuong cua doan thang
           Vecto chi phuong cua truc Ox la: (1,0)
         */
        int toaDoXVecto = this.d2.giaTriX() - this.d1.giaTriX();
        int toaDoYVecto = this.d2.giaTriY() - this.d1.giaTriY();
        double temp = (toaDoXVecto*1 + toaDoYVecto*0)/(Math.sqrt(Math.pow(toaDoXVecto, 2) + Math.pow(toaDoYVecto, 2)));
        return (int)Math.toDegrees(Math.acos(temp));
    }

    public static void main(String[] args) {
        
    }
}
