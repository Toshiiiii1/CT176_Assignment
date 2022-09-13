package buoi2;

import java.util.Scanner;

public class PhanSo {
    private int tuSo, mauSo;

    // ham xay dung mac nhien
    public PhanSo() {
        tuSo = 0;
        mauSo = 0;
    }

    // ham xay dung co hai tham so
    public PhanSo(int tu, int mau) {
        tuSo = tu;
        mauSo = mau;
    }

    // ham nhap phan so
    public void nhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap vao tu so: ");
            tuSo = sc.nextInt();
            System.out.print("Nhap vao mau so: ");
            mauSo = sc.nextInt();
        } while (mauSo == 0);
    }

    // ham hien thi phan so
    public void hienThi() {
        if (tuSo == 0)
            System.out.println("0");
        else if (mauSo == 1)
            System.out.println(tuSo);
        else if (mauSo < 0)
            System.out.printf("%d/%d\n", -tuSo, -mauSo);
        else
            System.out.printf("%d/%d\n", tuSo, mauSo);
    }

    // ham nghich dao
    public void nghichDao() {
        int temp;
        temp = tuSo;
        tuSo = mauSo;
        mauSo = temp;
    }

    // ham tinh gia tri nghich dao
    public PhanSo giaTriNghichDao() {
        PhanSo temp = new PhanSo();
        temp.tuSo = mauSo;
        temp.mauSo = tuSo;
        return temp;
    }

    // ham tinh gia tri cua phan so
    public float tinhGiaTri() {
        return (float)tuSo/mauSo;
    }

    // ham so sanh phan so
    public boolean lonHon(PhanSo a) {
        return this.tinhGiaTri() > a.tinhGiaTri();
    }

    // ham cong phan so
    public PhanSo congPhanSo(PhanSo a) {
        PhanSo result = new PhanSo();
        result.tuSo = (this.tuSo * a.mauSo) + (a.tuSo * this.mauSo);
        result.mauSo = this.mauSo * a.mauSo;
        return result;
    }

    // ham tru phan so
    public PhanSo truPhanSo(PhanSo a) {
        PhanSo result = new PhanSo();
        result.tuSo = (this.tuSo * a.mauSo) - (a.tuSo * this.mauSo);
        result.mauSo = this.mauSo * a.mauSo;
        return result;
    }

    // ham nhan phan so
    public PhanSo nhanPhanSo(PhanSo a) {
        PhanSo result = new PhanSo();
        result.tuSo = this.tuSo * a.tuSo;
        result.mauSo = this.mauSo * a.mauSo;
        return result;
    }

    // ham chia phan so
    public PhanSo chiaPhanSo(PhanSo a) {
        PhanSo result = new PhanSo();
        result.tuSo = this.tuSo * a.mauSo;
        result.mauSo = this.mauSo * a.tuSo;
        return result;
    }

    // ham cong phan so voi mot so
    public PhanSo congPhanSo(int n) {
        PhanSo result = new PhanSo();
        result.tuSo = this.tuSo + (n * this.mauSo);
        result.mauSo = this.mauSo;
        return result;
    }

    // ham tru phan so voi mot so
    public PhanSo truPhanSo(int n) {
        PhanSo result = new PhanSo();
        result.tuSo = this.tuSo - (n * this.mauSo);
        result.mauSo = this.mauSo;
        return result;
    }

    // ham nhan phan so voi mot so
    public PhanSo nhanPhanSo(int n) {
        PhanSo result = new PhanSo();
        result.tuSo = this.tuSo * n;
        result.mauSo = this.mauSo;
        return result;
    }

    // ham chia phan so voi mot so
    public PhanSo chiaPhanSo(int n) {
        PhanSo result = new PhanSo();
        result.tuSo = this.tuSo;
        result.mauSo = this.mauSo * n;
        return result;
    }

    public static void main(String[] args) {
        
    }
}
