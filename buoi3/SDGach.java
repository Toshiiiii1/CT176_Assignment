package buoi3;

import java.util.Scanner;

public class SDGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu trong danh sach: ");
        int n = sc.nextInt(), i;
        Gach ds[] = new Gach[n];
        
        for (i=0; i < n; i++) 
            ds[i] = new Gach();

        for (i=0; i < n; i++){
            System.out.println("Nhap vao phan tu thu " + i);
            ds[i].nhap();
            System.out.println();
        }

        for (i=0; i < n; i++)
            ds[i].hienThi();

        int maxIndex = 0;
        for (i=1; i < n; i++) {
            if (ds[maxIndex].giaBanLe()/(float)ds[maxIndex].DTNenToiDa() > ds[i].giaBanLe()/(float)ds[i].DTNenToiDa())
                maxIndex = i;
        }
        ds[maxIndex].hienThi();

        for (i=0; i < 3; i++) {
            int giaMotHop = (int)(ds[i].giaBanLe() - (ds[i].layGiaBan() * 20 / 100));
            System.out.println(giaMotHop * ds[i].soLuongHop(50, 2000));
        }
    }
}
