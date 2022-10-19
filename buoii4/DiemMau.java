package buoii4;

import java.util.Scanner;
import buoi3.Diem;

public class DiemMau extends Diem{

    private String mau;

    // ham xay dung mac nhien
    public DiemMau() {
        super();
        mau = new String();
    }

    // ham xay dung co tham so
    public DiemMau(int x, int y, String mau) {
        super(x, y);
        this.mau = mau;
    }

    // ham xay dun sao chep
    public DiemMau(DiemMau diemMau) {
        super((Diem)diemMau);
        this.mau = diemMau.mau;
    }

    // ham nhap
    public void nhapDiemMau() {
        super.nhapDiem();
        System.out.print("Nhap vao mau cua diem: ");
        Scanner sc = new Scanner(System.in);
        this.mau = sc.nextLine();
    }

    // ham in
    public void inDiemMau() {
        super.hienThi();
        System.out.println("\nMau cua diem la " + this.mau);
    }

    // ham toString
    public String toString() {
        return super.toString() + this.mau;
    }

    // ?
    public void inDiemMau(String s) {
        System.out.println(s);
        inDiemMau();
    }

    // thay doi mau cua diem
    public void ganMau(String mau) {
        this.mau = mau;
    }
    public static void main(String[] args) {
        
    }
}
