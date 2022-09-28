package buoi3;

import java.util.Scanner;

public class SDSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong sinh vien: ");
        int n = sc.nextInt();

        // khai bao danh sach sinh
        SinhVien ds[] = new SinhVien[n];
        int i, j;
        // khoi tao danh sach sinh vien
        for (i=0; i < n; i++)
            ds[i] = new SinhVien();
        for (i=0; i < n; i++) {
            System.out.println("-----Nhap vao sinh vien thu " + (i+1) + "-----");
            ds[i].nhap();
            ds[i].nhapDiem();
        }

        // hien thi danh sach sinh vien
        for (i=0; i < n; i++) {
            System.out.println("-----Thong tin sinh vien thu " + (i+1) + "-----");
            ds[i].hienThi();
        }

        // tim sinh vien bi canh cao hoc vu
        System.out.println("\n" + "-----Cac sinh vien bi canh cao hoc vu la-----");
        for (i=0; i < n; i++) {
            if (ds[i].diemTrungBinh() < 1.0f)
                ds[i].hienThi();
        }

        // tim sinh vien co diem trung binh cao nhat
        float max = ds[0].diemTrungBinh();
        for (i=1; i < n; i++)
            if (ds[i].diemTrungBinh() > max)
                max = ds[i].diemTrungBinh();
        System.out.println("\n" + "Sinh vien co diem trung binh cao nhat la: " + max);
        for (i=0; i < n; i++) 
            if (ds[i].diemTrungBinh() == max)
                ds[i].hienThi();
        
        // sap xep danh sach sinh vien theo bang chu cai trong ten
        for (i=0; i < n; i++) 
            for (j=i+1; j < n; j++)
                if (ds[i].getName().compareTo(ds[j].getName()) > 0){
                    SinhVien temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
        System.out.println("\n" + "Danh sach sinh vien sau khi sap xep: ");
        for (i=0; i < n; i++) {
            System.out.println("-----Thong tin sinh vien thu " + (i+1) + "-----");
            ds[i].hienThi();
        }
    }
}
