package buoi2;

import java.util.Scanner;

public class SDPhanSo {
	
	public static void nhapDanhSach(PhanSo[] danhSach) {
		int i;
        for (i=0; i < danhSach.length; i++) 
            danhSach[i] = new PhanSo();

        for (i=0; i < danhSach.length; i++) {
            System.out.printf("***Nhap phan so thu %d***\n", i+1);
            danhSach[i].nhapPhanSo();
        }
	}
	
	public static void hienThiDanhSach(PhanSo[] danhSach) {
		System.out.println("In cac phan so: ");
		int i;
        for (i=0; i < danhSach.length; i++) 
            danhSach[i].hienThi();
	}
	
	public static void sapXep(PhanSo[] danhSach) {
		int i, j;
		for (i = danhSach.length-1; i >= 1; i--)
            for (j=0; j < i; j++)
                if (danhSach[j].tinhGiaTri() > danhSach[j+1].tinhGiaTri()){
                    PhanSo temp = danhSach[j];
                    danhSach[j] = danhSach[j+1];
                    danhSach[j+1] = temp;
                }
	}
	
	public static PhanSo timMax(PhanSo[] danhSach) {
		PhanSo maxFraction = danhSach[0];
		int i;
        for (i=0; i < danhSach.length; i++) {
            if (maxFraction.tinhGiaTri() < danhSach[i].tinhGiaTri())
                maxFraction = danhSach[i];
        }
        return maxFraction;
	}
	
	public static PhanSo tinhTong(PhanSo[] danhSach) {
		PhanSo result = danhSach[0];
		int i;
        for (i=1; i < danhSach.length; i++) {
            result = result.congPhanSo(danhSach[i]);
        }
        return result;
	}
	
	public static void main(String[] args) {
        PhanSo a = new PhanSo(3, 7);
        PhanSo b = new PhanSo(4, 9);
        System.out.print("Gia tri cua phan so a: ");
        a.hienThi();
        System.out.print("Gia tri cua phan so b: ");
        b.hienThi();
        
        PhanSo x = new PhanSo();
        PhanSo y = new PhanSo();
        System.out.println("Nhap phan so x");
        x.nhapPhanSo();
        System.out.println("Nhap phan so y");
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
        nhapDanhSach(danhSach);
        hienThiDanhSach(danhSach);
        System.out.print("Tong gia tri cac phan so trong danh sach la: ");
        PhanSo sum = tinhTong(danhSach);
        sum.hienThi();
        System.out.print("Phan so lon nhat trong danh sach la: ");
        PhanSo maxFraction = timMax(danhSach);
        maxFraction.hienThi();
        sapXep(danhSach);
        System.out.println("Danh sach cac phan so sau khi sap xep: ");
        hienThiDanhSach(danhSach);
    }
}
