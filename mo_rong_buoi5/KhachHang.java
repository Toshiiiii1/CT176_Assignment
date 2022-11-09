package buoi5;

import java.util.Scanner;

public class KhachHang {
    private String cccd, hten, dchi;

    // ham xay dung mac nhien
    public KhachHang() {
        this.cccd = new String();
        this.hten = new String();
        this.dchi = new String();
    }

    // ham xay dung co tham so
    public KhachHang(String cccd, String hten, String dchi) {
        this.cccd = cccd;
        this.hten = hten;
        this.dchi = dchi;
    }

    // ham xay dung sao chep
    public KhachHang(KhachHang kh) {
        this.cccd = kh.cccd;
        this.hten = kh.hten;
        this.dchi = kh.dchi;
    }

    // ham nhap thong tin
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("-- Nhap vao CCCD cua khach hang: ");
        this.cccd = sc.nextLine();
        System.out.print("-- Nhap vao ho va ten cua khach hang: ");
        this.hten = sc.nextLine();
        System.out.print("-- Nhap vao dia chi cua khach hang: ");
        this.dchi = sc.nextLine();
    }

    // ham in thong tin
    public void in() {
        System.out.println("\tCan cuoc cong dan: " + this.cccd);
        System.out.println("\tHo & ten khach hang: " + this.hten);
        System.out.println("\tDia chi cua khach hang: " + this.dchi);
    }

    // ham tra ve thong tin
    public String toString() {
        return "\tCan cuoc cong dan: " + this.cccd + "\n" + "\tHo & ten khach hang: " + this.hten + "\n" + "\tDia chi cua khach hang: " + this.dchi;
    } 

    public static void main(String[] args) {
        KhachHang temp = new KhachHangVIP();
        temp.in();
    }
}
