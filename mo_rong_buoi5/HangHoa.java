package buoi5;

import java.util.Scanner;

public class HangHoa {
    private String mso, ten, nsxuat;

    // ham xay dung mac nhien
    public HangHoa() {
        this.mso = new String();
        this.ten = new String();
        this.nsxuat = new String();
    }
    
    // ham xay dung co tham so
    public HangHoa(String mso, String ten, String nsxuat) {
        this.mso = mso;
        this.ten = ten;
        this.nsxuat = nsxuat;
    }

    // ham xay dung sao chep
    public HangHoa(HangHoa h) {
        this.mso = h.mso;
        this.ten = h.ten;
        this.nsxuat = h.nsxuat;
    }

    // ham nhap thong tin
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("-- Nhap ma so hang hoa: ");
        this.mso = sc.nextLine();
        System.out.print("-- Nhap ten hang hoa: ");
        this.ten = sc.nextLine();
        System.out.print("-- Nhap nha san xuat hang hoa: ");
        this.nsxuat = sc.nextLine();
    }

    // ham in thong tin
    public void in() {
        System.out.println("\tMa so hang hoa: " + this.mso);
        System.out.println("\tTen hang hoa: " + this.ten);
        System.out.println("\tNha san xuat cua hang hoa: " + this.nsxuat);
    }

    // ham tra ve thong tin hang hoa
    public String toString() {
        return "\tMa so hang hoa: " + this.mso + "\n" + "\tTen hang hoa: " + this.ten + "\n" + "\tNha san xuat cua hang hoa: " + this.nsxuat + "\n";
    }
    public static void main(String[] args) {
    	
    }
}
