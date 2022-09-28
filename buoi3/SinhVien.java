package buoi3;

import java.util.Scanner;

public class SinhVien {

    private String mssv, hoTen;
    private Date ngaySinh;
    private int soLuong;
    private String[] mon, diem;

    // ham xay dung mac nhien
    public SinhVien() {
        mssv = new String();
        hoTen = new String();
        soLuong = 0;
        ngaySinh = new Date();
        mon = new String[100];
        diem = new String[100];
    }

    // ham xay dung sao chep
    public SinhVien(SinhVien sv) {
        this.mssv = new String(sv.mssv);
        this.hoTen = new String(sv.hoTen);
        this.soLuong = sv.soLuong;
        this.ngaySinh = new Date(sv.ngaySinh);
        this.mon = new String[100];
        this.diem = new String[100];
        int i;
        for (i=0; i < soLuong; i++) {
            mon[i] = new String(sv.mon[i]);
            diem[i] = new String(sv.diem[i]);
        }
    }

    // ham xay dung tham so
    public SinhVien(String mssv, String hoTen, Date ngaySinh, int soLuong, String mon[], String diem[]) {
        this.mssv = new String(mssv);
        this.hoTen = new String(hoTen);
        this.soLuong = soLuong;
        this.ngaySinh = new Date(ngaySinh);
        this.mon = new String[100];
        this.diem = new String[100];
        int i;
        for (i=0; i < soLuong; i++) {
            this.mon[i] = new String(mon[i]);
            this.diem[i] = new String(diem[i]);
        }
    }

    // ham in
    public void hienThi() {
        System.out.print("[" + mssv + ", " + hoTen + ", " + ngaySinh + ", " + soLuong);
        int i;
        for (i=0; i < soLuong; i++) {
            System.out.print(", " + mon[i] + " - " + diem[i]);
        }
        System.out.println("]");
    }

    // ham tra ve chuoi in
    public String toString() {
        String result = "[" + mssv + ", " + hoTen + ", " + ngaySinh + ", " + soLuong;
        int i;
        for (i=0; i < soLuong; i++) {
            result += ", " + mon[i] + " - " + diem[i];
        }
        return result + "]";
    }

    // ham nhap thong tin
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mssv: ");
        this.mssv = sc.nextLine();
        System.out.print("Nhap vao ho & ten sinh vien: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap vao ngay sinh cua sinh vien: ");
        this.ngaySinh.nhap();
    }

    // ham nhap cac mon va diem tuong ung
    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong mon da hoc: ");
        this.soLuong = sc.nextInt();
        sc.nextLine();
        int i;
        for (i=0; i < soLuong; i++) {
            System.out.println("Nhap vao ten mon & diem cua mon do: ");
            mon[i] = sc.nextLine();
            diem[i] = sc.nextLine();
        }
    }

    // ham tinh diem trung binh
    public float diemTrungBinh() {
        float sum = 0.0f;
        int i;
        for (i=0; i < this.soLuong; i++) {
            if (diem[i].equals("A"))
                sum += 4;
            else if (diem[i].equals("B+"))
                sum += 3.5;
            else if (diem[i].equals("B"))
                sum += 3;
            else if (diem[i].equals("C+"))
                sum += 2.5;
            else if (diem[i].equals("C"))
                sum += 2;
            else if (diem[i].equals("D+"))
                sum += 1.5;
            else if (diem[i].equals("B+"))
                sum += 1;
        }
        return (float)sum/this.soLuong;
    }

    // ham them mon & diem
    public void them(String mon, String diem) {
        if (this.soLuong < this.mon.length) {
            this.mon[soLuong] = new String(mon);
            this.diem[soLuong] = new String(diem);
            this.soLuong++;
        }
        else
            System.out.println("Loi");
    }

    // ham xoa mon & diem
    public void xoa(String mon) {
        int i, j;
        for (i=0; i < this.soLuong; i++) {
            if (this.mon[i].equals(mon))
                break;
        }

        if (i < this.soLuong) {
            for (j=i; j < this.soLuong; j++) {
                this.mon[j] = this.mon[j+1];
                this.diem[j] = this.diem[j+1];
            }
            this.soLuong--;
        }        
    }

    // ham tra ve ten cua sinh vien
    public String getName() {
        String[] temp = this.hoTen.split(" ");
		return (temp[temp.length-1]);
    }
    public static void main(String[] args) {
        
    }
}
