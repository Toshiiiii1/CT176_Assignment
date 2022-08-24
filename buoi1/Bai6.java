package buoi1;

import java.util.Scanner;
import java.lang.Math;

public class Bai6 {

	public boolean isPrime(int a) {
		if (a < 2) {
			return false;
		}
		else{
			int i;
			for (i=2; i <= Math.sqrt(a); i++) {
				if (a % i == 0)
					return false;
			}
			return true;
		}
	}

	public void convertDecToBin(int a) {
		int[] binaryNumber = new int[20];
		int i = 0;
		while (a > 0) {
			binaryNumber[i] = a%2;
			a /= 2;
			i++;
		}
		for (i -= 1 ;i >= 0; i--) {
			System.out.print(binaryNumber[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		int num1 = 0;
		while (true) {
			System.out.print("Nhap so a: ");
			a = sc.nextLine();

			try {
				num1 = Integer.parseInt(a);
			} catch (Exception e) {
				System.out.println("Nhap dung a");
				continue;
			}
			break;
		}
		Bai6 mainObj = new Bai6();
		if (mainObj.isPrime(num1) == true)
			System.out.printf("%d la so nguyen to\n", num1);
		else
			System.out.printf("%d khong la so nguyen to\n", num1);
		mainObj.convertDecToBin(num1);
	}	
}