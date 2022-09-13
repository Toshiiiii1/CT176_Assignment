package buoi2;

public class SDDiem {
    public static void main(String[] args) {
        // tao diem A & hien thi diem A
        Diem A = new Diem(3, 4);
        A.hienThi();

        // tao diem B nhap tu ban phim & hien thi
        Diem B = new Diem();
        B.nhapDiem();
        B.hienThi();

        // tao diem C doi xung voi diem B & hien thi
        Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
        C.hienThi();

        // khoang cach tu diem B den goc toa do
        System.out.println(B.khoangCach());

        // khoang cach tu diem A den diem B
        System.out.println(A.khoangCach(B));
    }
}
