package buoi1;

import java.util.Scanner;
import java.lang.Math;

public class Bai7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho va ten: ");
		String name = sc.nextLine();
		String[] temp = name.split(" ");
		System.out.println(temp[temp.length-1]);
	}	
}