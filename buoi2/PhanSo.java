package buoi2;

import java.util.Scanner;
import java.lang.Math;

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
    	if (tuSo != 0){
    		int temp;
	        temp = tuSo;
	        tuSo = mauSo;
	        mauSo = temp;
    	}
    	else
    		System.out.println("Khong the nghich dao");
    }

    // ham tinh gia tri nghich dao
    public PhanSo giaTriNghichDao() {
    	PhanSo temp = new PhanSo();
    	if (tuSo != 0) {
	        temp.tuSo = mauSo;
	        temp.mauSo = tuSo;
	        return temp;
    	}
    	else {
    		System.out.println("Khong the nghich dao");
    		return temp;
    	}
    }

    // ham tinh gia tri cua phan so
    public float tinhGiaTri() {
        return (float)tuSo/mauSo;
    }

    // ham so sanh phan so
    public boolean lonHon(PhanSo a) {
        return this.tinhGiaTri() > a.tinhGiaTri();
    }
    
    // ham tim uoc chung lon nhat
    public int GCD(int a, int b) {
    	int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }
    
    // ham toi gian phan so
    public void toiGian() {
    	int gcd = GCD(tuSo, mauSo);
    	tuSo /= gcd;
    	mauSo /= gcd;
    }

    // ham cong phan so
    public PhanSo congPhanSo(PhanSo a) {
        PhanSo result = new PhanSo();
        result.tuSo = (tuSo * a.mauSo) + (a.tuSo * mauSo);
        result.mauSo = mauSo * a.mauSo;
        result.toiGian();
        return result;
    }

    // ham tru phan so
    public PhanSo truPhanSo(PhanSo a) {
        PhanSo result = new PhanSo();
        result.tuSo = (tuSo * a.mauSo) - (a.tuSo * mauSo);
        result.mauSo = mauSo * a.mauSo;
        return result;
    }

    // ham nhan phan so
    public PhanSo nhanPhanSo(PhanSo a) {
        PhanSo result = new PhanSo();
        result.tuSo = tuSo * a.tuSo;
        result.mauSo = mauSo * a.mauSo;
        return result;
    }

    // ham chia phan so
    public PhanSo chiaPhanSo(PhanSo a) {
        PhanSo result = new PhanSo();
        result.tuSo = tuSo * a.mauSo;
        result.mauSo = mauSo * a.tuSo;
        return result;
    }

    // ham cong phan so voi mot so
    public PhanSo congPhanSo(int n) {
        PhanSo result = new PhanSo();
        result.tuSo = tuSo + (n * mauSo);
        result.mauSo = mauSo;
        result.toiGian();
        return result;
    }

    // ham tru phan so voi mot so
    public PhanSo truPhanSo(int n) {
        PhanSo result = new PhanSo();
        result.tuSo = tuSo - (n * mauSo);
        result.mauSo = mauSo;
        return result;
    }

    // ham nhan phan so voi mot so
    public PhanSo nhanPhanSo(int n) {
        PhanSo result = new PhanSo();
        result.tuSo = tuSo * n;
        result.mauSo = mauSo;
        return result;
    }

    // ham chia phan so voi mot so
    public PhanSo chiaPhanSo(int n) {
        PhanSo result = new PhanSo();
        result.tuSo = tuSo;
        result.mauSo = mauSo * n;
        return result;
    }

    public static void main(String[] args) {
    	PhanSo temp1 = new PhanSo(3,4);
    	PhanSo temp2 = new PhanSo(5,6);
    	temp1 = temp1.congPhanSo(temp2);
    	temp1.hienThi();
    }
}
