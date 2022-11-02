package buoi5;

import java.util.Scanner;

public class HoaDon {
    private String mso, tde, nvien;
    private Date ngayLap;

    // ham xay dung mac nhien
    public HoaDon() {
        this.mso = new String();
        this.tde = new String();
        this.nvien = new String();
        this.ngayLap = new Date();
    }

    // ham xay dung co tham so
    public HoaDon(String mso, String tde, String nvien, int ngay, int thang, int nam) {
        this.mso = mso;
        this.tde = tde;
        this.nvien = nvien;
        this.ngayLap = new Date(ngay, thang, nam);
    }

    // ham xay dung sao chep
    public HoaDon(HoaDon hoaDon) {
        this.mso = hoaDon.mso;
        this.tde = hoaDon.tde;
        this.nvien = hoaDon.nvien;
        this.ngayLap = new Date(hoaDon.ngayLap);
    }

    // ham nhap thong tin
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma so hoa don: ");
        this.mso = sc.nextLine();
        System.out.print("Nhap vao tieu de hoa don: ");
        this.tde = sc.nextLine();
        System.out.print("Nhap vao nhan vien tao hoa don: ");
        this.nvien = sc.nextLine();
        System.out.println("Nhap thoi gian tao hoa don: ");
        this.ngayLap.nhap();
    }

    // ham in thong tin
    public void in() {
        System.out.println("********************");
        System.out.println("Ma so hoa don: " + this.mso);
        System.out.println("Tieu de hoa don: " + this.tde);
        System.out.println("Nhan vien tao hoa don: " + this.nvien);
        System.out.println("Ngay tao hoa don: " + this.ngayLap);
    }

    // ham tra ve thong tin
    public String toString() {
        return "********************" + "\n" + "Ma so hoa don: " + this.mso + "\n" + "Tieu de hoa don: " + this.tde + "\n" + "Nhan vien tao hoa don: " + this.nvien + "\n" + "Ngay tao hoa don: " + this.ngayLap + "\n";
    }

    public static void main(String[] args) {
        
    }
}
