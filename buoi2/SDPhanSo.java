package buoi2;

import java.util.Scanner;

public class SDPhanSo {
    public static void main(String[] args) {
        PhanSo a = new PhanSo(3, 7);
        PhanSo b = new PhanSo(4, 9);
        a.hienThi();
        b.hienThi();

        PhanSo x = new PhanSo();
        PhanSo y = new PhanSo();
        x.nhapPhanSo();
        y.nhapPhanSo();
        
        PhanSo xNghichDao = x.giaTriNghichDao();
        System.out.print("Gia tri nghich dao cua phan so x la: ");
        xNghichDao.hienThi();

        System.out.print("Tong cua hai phan so x va y la: ");
        PhanSo total = x.congPhanSo(y);
        total.hienThi();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua mang: ");
        int n = sc.nextInt();
        PhanSo[] danhSach = new PhanSo[n];
        int i, j;
        for (i=0; i < n; i++) 
            danhSach[i] = new PhanSo();

        for (i=0; i < n; i++) {
            System.out.printf("***Nhap phan so thu %d***\n", i+1);
            danhSach[i].nhapPhanSo();
        }
        
        System.out.println("In cac phan so: ");
        for (i=0; i < n; i++) 
            danhSach[i].hienThi();
        
        float sum = 0;
        PhanSo maxFraction = danhSach[0];
        for (i=0; i < n; i++) {
            if (maxFraction.tinhGiaTri() < danhSach[i].tinhGiaTri())
                maxFraction = danhSach[i];
            sum += danhSach[i].tinhGiaTri();
        }
        System.out.printf("Tong gia tri cac phan so trong danh sach la: %.2f\n", sum);
        System.out.print("Phan so lon nhat trong danh sach la: ");
        maxFraction.hienThi();

        for (i = n-1; i >= 1; i--)
            for (j=0; j < i; j++)
                if (danhSach[j].tinhGiaTri() > danhSach[j+1].tinhGiaTri()){
                    PhanSo temp = danhSach[j];
                    danhSach[j] = danhSach[j+1];
                    danhSach[j+1] = temp;
                }

        System.out.println("In cac phan so: ");
        for (i=0; i < n; i++) 
            danhSach[i].hienThi();
    }
}
