package buoi5;

import java.util.Scanner;

public class ChiTiet { 
    private int sluong;
    private double dgia;
    private HangHoa hh;

    // ham xay dung mac nhien
    public ChiTiet() {
        this.hh = new HangHoa();
        this.sluong = 0;
        this.dgia = 0.0;
    }
    
    // ham xay dung co tham so
    public ChiTiet(int sluong, double dgia, HangHoa hh) {
        this.sluong = sluong;
        this.dgia = dgia;
        this.hh = new HangHoa(hh);
    }

    // ham xay dung sao chep
    public ChiTiet(ChiTiet ct) {
        this.sluong = ct.sluong;
        this.dgia = ct.dgia;
        this.hh = new HangHoa(ct.hh);
    }

    // ham nhap thong tin
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("-- Nhap so luong hang hoa: ");
        this.sluong = sc.nextInt();
        System.out.print("-- Nhap don gia cua hang hoa: ");
        this.dgia = sc.nextDouble();
        this.hh.nhap();
    }

    // ham in thong tin
    public void in() {
        System.out.println("\tSo luong hang hoa: " + this.sluong);
        System.out.println("\tDon gia hang hoa: " + this.dgia);
        System.out.println("\tThong tin hang hoa\n" + this.hh);
    }

    // ham tra ve thong tin
    public String toString() {
        return "\tSo luong hang hoa: " + this.sluong + "\n" + "\tDon gia hang hoa: " + this.dgia + "\n" + this.hh;
    }
    
    public static void main(String[] args) {
        
    }
}
