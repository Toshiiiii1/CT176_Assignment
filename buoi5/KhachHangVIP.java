package buoi5;

import java.util.Scanner;

public class KhachHangVIP extends KhachHang {
    private Double tiLeGiam;
    private Date d;

    // ham xay dung mac nhien
    public KhachHangVIP() {
        super();
        this.d = new Date();
        this.tiLeGiam = 0.0;
    }

    // ham xay dung co tham so
    public KhachHangVIP(String cccd, String hten, String dchi, Double tiLeGiam, int ngay, int thang, int nam) {
        super(cccd, hten, dchi);
        this.d = new Date(ngay, thang, nam);
        this.tiLeGiam = tiLeGiam;
    }

    // ham xay dung sao chep
    public KhachHangVIP(KhachHangVIP khv) {
        super((KhachHang)khv);
        this.d = new Date(khv.d);
        this.tiLeGiam = khv.tiLeGiam;
    }

    // ham nap thong tin
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap vao thoi gian: ");
        this.d.nhap();
        System.out.print("Nhap vao ti le giam: ");
        this.tiLeGiam = sc.nextDouble();
    }

    // ham in thong tin
    public void in() {
        super.in();
        System.out.println("Thoi gian: " + this.d);
        System.out.println("Ti le giam gia don hang cho khach hang VIP: " + this.tiLeGiam);
    }

    // ham tra ve thong tin
    public String toString() {
        return super.toString() + this.d + "\n" + "Ti le giam gia don hang cho khach hang VIP: " + this.tiLeGiam;
    }
    public static void main(String[] args) {
        KhachHangVIP temp = new KhachHangVIP();
        temp.nhap();
        temp.in();
    }
}
