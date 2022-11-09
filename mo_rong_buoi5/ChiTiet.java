package mo_rong_buoi5;

import java.util.Scanner;

public class ChiTiet { 
    private int sluong;
    private double dgia;
    private HangHoa[] hh;

    // ham xay dung mac nhien
    public ChiTiet() {
        this.hh = new HangHoa[100];
        this.sluong = 0;
        this.dgia = 0.0;
    }
    
    // ham xay dung co tham so
    public ChiTiet(int sluong, double dgia, HangHoa hh[]) {
        this.sluong = sluong;
        this.dgia = dgia;
        int i;
        for (i=0; i < this.sluong; i++)
            this.hh[i] = new HangHoa(hh[i]);
    }

    // ham xay dung sao chep
    public ChiTiet(ChiTiet ct) {
        this.sluong = ct.sluong;
        this.dgia = ct.dgia;
        int i;
        for (i=0; i < this.sluong; i++)
            this.hh[i] = new HangHoa(ct.hh[i]);
    }

    // ham nhap thong tin
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hang hoa: ");
        this.sluong = sc.nextInt();
        System.out.print("Nhap don gia cua hang hoa: ");
        this.dgia = sc.nextDouble();
        int i;
        for (i=0; i < this.sluong; i++) {
            System.out.println("Nhap thong tin hang hoa thu " + (i+1));
            this.hh[i] = new HangHoa();
            this.hh[i].nhap();
        }
    }

    // ham in thong tin
    public void in() {
        System.out.println("So luong hang hoa: " + this.sluong);
        System.out.println("Don gia hang hoa: " + this.dgia);
        int i;
        for (i=0; i < this.sluong; i++){
            System.out.println("Thong tin hang hoa thu " + (i+1));
            this.hh[i].in();
        }
    }

    // ham tra ve thong tin
    public String toString() {
        String str = new String();
        str += "\tSo luong hang hoa: " + this.sluong + "\n" + "\tDon gia hang hoa: " + this.dgia + "\n";
        int i;
        for (i=0; i < this.sluong; i++) {
            str += "\tThong tin hang hoa thu " + (i+1) + "\n";
            str += this.hh[i];
        }
        return str;
    }
    public static void main(String[] args) {
        
    }
}
