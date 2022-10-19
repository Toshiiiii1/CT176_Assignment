package buoii4;

import java.util.Scanner;

public class SDSinhVienCNTT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SinhVienCNNT ds[] = new SinhVienCNNT[n];
        
        int i;
        for (i=0; i < n; i++) {
            System.out.println("----- Nhap thong tin cho sinh vien thu " + (i+1) + " -----");
            ds[i] = new SinhVienCNNT();
            ds[i].nhap();
            sc.nextLine();
        }

        for (SinhVienCNNT sv : ds) {
            sv.in();
        }

        System.out.print("Nhap email can tim: ");
        String email = sc.nextLine();
        for (SinhVienCNNT sv : ds) {
            if (sv.layEmail().equals(email)) {
                sv.in();
                break;
            }
        }
    }
}
