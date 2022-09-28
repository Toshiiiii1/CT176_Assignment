package buoi3;

public class SDDoanThang {
    public static void main(String[] args) {
        // tao 2 diem A(2, 5) va B(20, 35)
        Diem A = new Diem(2, 5);
        Diem B = new Diem(20, 35);

        // tao doan thang AB
        DoanThang AB = new DoanThang(A, B);
        System.out.println("Toa do cua doan thang AB la: " + AB);

        // tinh tien doan thang AB di mot doan (5, 3)
        AB.tinhTien(5, 3);
        System.out.println("Toa do cua doan thang AB sau khi tinh tien la: " + AB);

        // nhap doan thang CD va hien thi CD
        DoanThang CD = new DoanThang();
        CD.nhap();
        System.out.println("Toa do cua doan thang CD la: " + CD);

        // goc giua doan thang CD voi truc Ox
        System.out.println("Goc giua doan thang CD voi truc Ox la: " + CD.tinhGoc());
    }
}
