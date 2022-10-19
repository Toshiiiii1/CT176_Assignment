package buoii4;

import java.util.Scanner;

public class SDCacConVat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so con vat: ");
		int n = sc.nextInt();
		ConVat ds[] = new ConVat[n];
		int i;
		for (i=0; i < n; i++) {
			System.out.println("----- Nhap con vat thu " + (i+1) + " -----");
			System.out.println("Nhap thu tu con vat: 1 - Heo, 2 - Bo, 3 - De, 4 - Ga");
			int c = sc.nextInt();
			if (c == 1) {
				System.out.println("Nhap con heo");
				ds[i] = new ConHeo();
			}
			else if (c == 2) {
				System.out.println("Nhap con bo");
				ds[i] = new ConBo();
			}
			else if (c == 3) {
				System.out.println("Nhap con de");
				ds[i] = new ConDe();
			}
			else if (c == 4) {
				System.out.println("Nhap con ga");
				ds[i] = new ConGa();
			}
			ds[i].nhap();
		}
		
		for (ConVat cv : ds) {
			System.out.println(cv);
			cv.Keu();
		}
	}

}
