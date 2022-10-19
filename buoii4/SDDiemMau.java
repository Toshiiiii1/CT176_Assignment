package buoii4;

public class SDDiemMau {
    public static void main(String[] args) {
        DiemMau A = new DiemMau(5, 10, "trang");
        A.inDiemMau();
        
        DiemMau B = new DiemMau();
        B.nhapDiemMau();
        B.doiDiem(10, 8);
        B.inDiemMau();
        B.ganMau("vang");
        B.inDiemMau();
    }
}
