package buoi2;

public class SDDate {
    public static void main(String[] args) {
        Date date1 = new Date();
        date1.hienThi();

        Date date2 = new Date(14, 7, 2002);
        date2.hienThi();

        Date date3 = new Date();
        date3.nhap();
        date3.hienThi();

        Date date4 = new Date(31, 6, 2021);
        System.out.println(date4.hopLe());

        Date date5 = new Date(31, 12, 2002);
        date5 = date5.ngayHomSau();
        date5.hienThi();

        Date date6 = new Date(14, 7, 2002);
        date6 = date6.congNgay(30);
        date6.hienThi();
    }
}
