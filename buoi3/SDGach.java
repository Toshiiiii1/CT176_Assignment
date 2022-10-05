package buoi3;

import java.util.Scanner;

public class SDGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu trong danh sach: ");
        int n = sc.nextInt(), i;
        Gach ds[] = new Gach[n];
        
        // khoi tao danh sach
        for (i=0; i < n; i++) 
            ds[i] = new Gach();
        
        // nhap cac phan tu trong danh sach
        for (i=0; i < n; i++){
            System.out.println("Nhap vao phan tu thu " + (i+1));
            ds[i].nhap();
            System.out.println();
        }
        
        // hien thi cac phan tu trong danh sach
        for (i=0; i < n; i++)
            ds[i].hienThi();
        
        // hien thi ra man hinh loai gach cho chi phi lot thap nhat
        int maxIndex = 0;
        for (i=1; i < n; i++) {
            if (ds[maxIndex].giaBanLe()/(float)ds[maxIndex].DTNenToiDa() > ds[i].giaBanLe()/(float)ds[i].DTNenToiDa())
                maxIndex = i;
        }
        System.out.println("Loai gach cp chi phi lot thap nhat la: ");
        ds[maxIndex].hienThi();
        
        // tinh chi phi mua tung loai gach voi dien tich co chieu dai la 5m va chieu rong la 20m
        for (i=0; i < n; i++) {
        	System.out.println("Tong chi phi mua loai gach thu " + (i+1) + " la:");
            System.out.println(ds[i].layGiaBan() * ds[i].soLuongHop(50, 2000));
        }
    }
}
