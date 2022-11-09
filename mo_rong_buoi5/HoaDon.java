package buoi5;

import java.util.Scanner;

public class HoaDon {
    private String mso, tde, nvien;
    private Date ngayLap;
    private KhachHang kh;
    private ChiTiet ct[];

    // ham xay dung mac nhien
    public HoaDon() {
        this.mso = new String();
        this.tde = new String();
        this.nvien = new String();
        this.ngayLap = new Date();
        this.kh = new KhachHang();
        this.ct = new ChiTiet[20];
    }

    // ham xay dung co tham so
    public HoaDon(String mso, String tde, String nvien, Date ngayLap, KhachHang kh, ChiTiet ct[]) {
        this.mso = mso;
        this.tde = tde;
        this.nvien = nvien;
        this.ngayLap = new Date(ngayLap);
        this.kh = new KhachHang(kh);
        int j = 0;
        for (ChiTiet i : ct)
        	this.ct[j++] = new ChiTiet(i);
    }

    // ham xay dung sao chep
    public HoaDon(HoaDon hoaDon) {
        this.mso = hoaDon.mso;
        this.tde = hoaDon.tde;
        this.nvien = hoaDon.nvien;
        this.ngayLap = new Date(hoaDon.ngayLap);
        this.kh = new KhachHang(hoaDon.kh);
        int j = 0;
        for (ChiTiet i : hoaDon.ct)
        	this.ct[j++] = new ChiTiet(i);
    }

    // ham nhap thong tin
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma so hoa don: ");
        this.mso = sc.nextLine();
        System.out.print("Nhap vao tieu de hoa don: ");
        this.tde = sc.nextLine();
        System.out.print("Nhap vao nhan vien tao hoa don: ");
        this.nvien = sc.nextLine();
        System.out.println("Nhap thoi gian tao hoa don: ");
        this.ngayLap.nhap();
        System.out.println("Nhap thong tin khach hang: ");
        System.out.print("Khach hang co thuoc khach hang VIP khong? ");
        int check = sc.nextInt();
        if (check == 1) {
            this.kh = new KhachHangVIP();
            this.kh.nhap();
        }
        else
            this.kh.nhap();
        System.out.print("Nhap so luong chi tiet: ");
        int n = sc.nextInt();
        int i;
        for (i=0; i < n; i++ ) {
	        System.out.println("Nhap thong tin chi tiet hoa don " + (i+1));
        	this.ct[i] = new ChiTiet();
	        this.ct[i].nhap();
        }
    }

    // ham in thong tin
    public void in() {
        System.out.println("********************");
        System.out.println("Thong tin hoa don");
        System.out.println("\tMa so hoa don: " + this.mso);
        System.out.println("\tTieu de hoa don: " + this.tde);
        System.out.println("\tNhan vien tao hoa don: " + this.nvien);
        System.out.println("Ngay tao hoa don: " + this.ngayLap);
        System.out.println("Thong tin khach hang\n" + this.kh);
        for (ChiTiet i : this.ct) {
        	if (i == null)
        		continue;
        	System.out.println("Thong tin chi tiet hang hoa\n" + i);
        }
    }

    // ham tra ve thong tin
    public String toString() {
        String str = "********************\n" + "Thong tin hoa don\n" + "\tMa so hoa don: " + this.mso + "\n" + "\tTieu de hoa don: " + this.tde + "\n" + "\tNhan vien tao hoa don: " + this.nvien + "\n" + "Ngay tao hoa don: " + this.ngayLap + "\n" + "Thong tin khach hang\n" + this.kh + "\n";
        for (ChiTiet i : this.ct) {
        	if (i == null)
        		continue;
        	str += "Thong tin chi tiet hang hoa\n" + i;
        }
        return str;
    }
    
    // ham tinh tong
    public double tinhTong() {
    	double sum = 0.0;
    	for (ChiTiet i : this.ct) {
    		if (i == null)
    			continue;
    		sum += i.giaTriHangHoa();
    	}
    	return sum;
    }

    public static void main(String[] args) {
        HoaDon temp = new HoaDon();
        temp.nhap();
        System.out.println(temp.tinhTong());
    }
}
