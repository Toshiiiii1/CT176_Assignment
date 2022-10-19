package buoii4;

import java.util.Scanner;
import buoi3.SinhVien;
import buoi3.Date;

public class SinhVienCNNT extends SinhVien {

    private String taiKhoan, matKhau, email;

    // ham xay dung mac nhien
    public SinhVienCNNT() {
        super();
        taiKhoan = new String();
        matKhau = new String();
        email = new String();
    }

    // ham xay dung co tham so
    public SinhVienCNNT(String mssv, String hoTen, Date ngaySinh, int soLuong, String mon[], String diem[], String taiKhoan, String matKhau, String email) {
        super(mssv, hoTen, ngaySinh, soLuong, mon, diem);
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.email = email;
    }

    // ham xay dung sao chep
    public SinhVienCNNT(SinhVienCNNT sv) {
        super((SinhVien) sv);
        this.taiKhoan = sv.taiKhoan;
        this.matKhau = sv.matKhau;
        this.email = sv.email;
    }

    // ham nhap thong tin sinh vien
    public void nhap() {
        super.nhap();
        super.nhapDiem();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten tai khoan: ");
        this.taiKhoan = sc.nextLine();
        System.out.print("Nhap vao mat khau: ");
        this.matKhau = sc.nextLine();
        System.out.print("Nhap vao dia chi email: ");
        this.email = sc.nextLine();
    }

    // ham in thong tin sinh vien
    public void in() {
        super.hienThi();
        System.out.println("Tai khoan cua sinh vien la: " +  this.taiKhoan);
        System.out.println("Email cua sinh vien la: " +  this.email);
    }

    // ham toString
    public String toString() {
        return super.toString() + "\n" + "Tai khoan cua sinh vien la:" + this.taiKhoan + "\n" +  "Email cua sinh vien la: " + this.email;
    }

    // ham doi mat khau
    public void DoiMatKhau(String newPass) {
        this.matKhau = newPass;
    }

    // ham lay dia chi email cua sinh vien
    public String layEmail() {
        return this.email;
    }
    public static void main(String[] args) {
        
    }
}
