package buoii4;

import java.util.Scanner;

abstract class ConVat {

    private String giong, mauLong;
    private int canNang;

    // ham xay dung mac nhien
    public ConVat() {
        this.giong = new String();
        this.mauLong = new String();
        this.canNang = 0;
    }
    
    // ham xay dung co tham so
    public ConVat(String giong, String mauLong, int canNang) {
    	this.giong = giong;
    	this.mauLong = mauLong;
    	this.canNang = canNang;
    }
    
    // ham xay dung sao chep
    public ConVat(ConVat cv) {
    	this.giong = cv.giong;
    	this.mauLong = cv.mauLong;
    	this.canNang = cv.canNang;
    }
    
    // ham nhap thong tin cac con vat
    public void nhap() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Nhap giong: ");
    	this.giong = sc.nextLine();
    	System.out.print("Nhap mau long: ");
    	this.mauLong = sc.nextLine();
    	System.out.print("Nhap can nang: ");
    	this.canNang = sc.nextInt();
    }
    
    // ham in thong tin con vat
    public void in() {
    	System.out.println("[" + this.giong + ", " + this.mauLong + ", " + this.canNang + "]");
    }
    
    // ham toString
    public String toString() {
    	return "[" + this.giong + ", " + this.mauLong + ", " + this.canNang + "]";
    }
    
    public abstract void Keu();
    
    public static void main(String[] args) {
        
    }
}