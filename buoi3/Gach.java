package buoi3;

import java.util.Scanner;
import java.lang.Math;

public class Gach {
    private String maSo, mau;
    private int soLuong, chieuDai, chieuRong;
    private long giaBan;

    public Gach() {
        maSo = mau = new String();
        soLuong = chieuDai = chieuRong = 0;
        giaBan = 0;
    }

    public Gach(String maSo, String mau, int soLuong, int chieuDai, int chieuRong, long giaBan) {
        this.maSo = maSo;
        this.mau = mau;
        this.soLuong = soLuong;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.giaBan = giaBan;
    }

    public Gach(Gach a) {
        this.maSo = a.maSo;
        this.mau = a.mau;
        this.soLuong = a.soLuong;
        this.chieuDai = a.chieuDai;
        this.chieuRong = a.chieuRong;
        this.giaBan = a.giaBan;
    }

    public void hienThi() {
        System.out.printf("Ma so cua hop gach: %s\n", this.maSo);
        System.out.printf("Mau cua gach: %s\n", this.mau);
        System.out.printf("So luong vien gach trong hop: %d\n", this.soLuong);
        System.out.printf("Chieu dai cua vien gach: %dcm\n", this.chieuDai);
        System.out.printf("Chieu rong cua vien gach: %dcm\n", this.chieuRong);
        System.out.printf("Gia ban mot hop gach: %d dong\n", this.giaBan);
        System.out.println();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma so cua hop gach: ");
        this.maSo = sc.nextLine();
        System.out.print("Nhap vao mau cua hop gach: ");
        this.mau = sc.nextLine();
        System.out.print("Nhap vao so luong gach cua hop gach: ");
        this.soLuong = sc.nextInt();
        System.out.print("Nhap vao chieu dai cua vien gach: ");
        this.chieuDai = sc.nextInt();
        System.out.print("Nhap vao chieu rong cua vien gach: ");
        this.chieuRong = sc.nextInt();
        System.out.print("Nhap vao gia ban cua hop gach: ");
        this.giaBan = sc.nextLong();
    }

    public float giaBanLe() {
        return (float)(this.giaBan / this.soLuong) + (this.giaBan*20/100);
    }

    public int DTNenToiDa() {
        return this.chieuDai * this.chieuRong * this.soLuong;
    }

    public int soLuongHop(int D, int N) {
        float DTNen = D*N;
        float DTGach = this.DTNenToiDa();
        return (int)Math.round(DTNen/DTGach);
    }

    public long layGiaBan() {
        return this.giaBan;
    }

    public static void main(String[] args) {
        Gach temp = new Gach();
        temp.nhap();
        temp.hienThi();
        System.out.println(temp.layGiaBan());
    }
}
