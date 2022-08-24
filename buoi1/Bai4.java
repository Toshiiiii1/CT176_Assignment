package buoi1;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b;
		int num1 = 0, num2 = 0;
		while (true) {
			System.out.print("Nhap so a: ");
			a = sc.nextLine();
			System.out.print("Nhap so b: ");
			b = sc.nextLine();

			try {
				num1 = Integer.parseInt(a);
				num2 = Integer.parseInt(b);
			} catch (Exception e) {
				System.out.println("Nhap dung a hoac b");
				continue;
			}
			break;
		}

		System.out.println(num1+num2);
	}
}