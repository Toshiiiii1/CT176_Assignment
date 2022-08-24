package buoi1;

import java.util.Scanner;
import java.lang.Math;

public class Bai5 {

	public static void giaiPTBac1(int a, int b) {
		System.out.print("Nghiem cua phuong trinh la: ");
		System.out.println(-b/a);
	}

	public static void giaiPTBac2(int a, int b, int c) {
		double delta = b*b - 4*a*c;
		if (delta < 0.0)
			System.out.println("Phuong trinh vo nghiem");
		else if (delta == 0.0){
			System.out.printf("Phuong trinh co nghiem kep x1 = x2 = %.2f\n", (-b/2.0*a));
		}
		else{
			System.out.println("Phuong trinh co hai nghiem phan biet: ");
			System.out.printf("x1 = %.2f\n", (-b + Math.sqrt(delta))/(2*a));
			System.out.printf("x2 = %.2f\n", (-b - Math.sqrt(delta))/(2*a));
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b, c;
		int num1 = 0, num2 = 0, num3 = 0;
		while (true) {
			System.out.print("Nhap so a: ");
			a = sc.nextLine();
			System.out.print("Nhap so b: ");
			b = sc.nextLine();
			System.out.print("Nhap so c: ");
			c = sc.nextLine();

			try {
				num1 = Integer.parseInt(a);
				num2 = Integer.parseInt(b);
				num3 = Integer.parseInt(c);
			} catch (Exception e) {
				System.out.println("Nhap dung a hoac b hoac c");
				continue;
			}
			break;
		}
		
		if (num1 == 0)
			Bai5.giaiPTBac1(num2, num3);
		else
			Bai5.giaiPTBac2(num1, num2, num3);
	}	
}