package buoi1;

import java.util.Scanner;

public class Bai8 {
	
	static Scanner sc = new Scanner(System.in);
	public void input(int[] arr) {
		System.out.println("Nhap cac phan tu trong mang: ");
		int i;
		for (i=0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public int countElement (int[] arr, int x){
		int total = 0;
		for (int e : arr) {
			if (e == x)
				total++;
		}
		
		return total;
	}
	
	public void sort(int[] arr) {
		System.out.println("Sap xep cac phan tu trong mang tang dan: ");
		int i, j;
		for (i=0; i < arr.length; i++) {
			for (j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public void printElement(int[] arr) {
		for (int e : arr) {
			System.out.printf("%d ", e);
		}
		System.out.println();
	}

	public int[] insertElement(int[] arr, int x, int pos) {
		int i;
		int[] newArr = new int[arr.length + 1];

		for (i=0; i < arr.length+1; i++){
			if (i < pos)
				newArr[i] = arr[i];
			else if (i == pos)
				newArr[i] = x;
			else
				newArr[i] = arr[i-1];
		}

		return newArr;
	}

	public int[] deleteElement(int[] arr, int pos) {
		int i;
		int newArr[] = new int[arr.length-1];

		for (i=0; i < arr.length; i++) {
			if (i < pos)
				newArr[i] = arr[i];
			else if (i == pos)
				continue;
			else
				newArr[i-1] = arr[i];
		}

		return newArr;
	}

	public void modifyElement(int[] arr, int x, int pos) {
		int i;
		for (i=0; i < arr.length; i++){
			if (i == pos)
				arr[i] = x;
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Nhap so luong phan tu: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		Bai8 obj = new Bai8();
		
		// nhap cac mang
		obj.input(arr);

		// dem so luong mot gia tri trong mang
		System.out.print("Nhap so can tim: ");
		int x = sc.nextInt();
		System.out.printf("So luong phan tu %d trong mang la: %d\n", x, obj.countElement(arr, x));

		// them 1 p.tu vao mang
		int[] temp1 = obj.insertElement(arr, 9, 2);

		// xoa 1 p.tu khoi mang
		int[] temp2 = obj.deleteElement(arr, 2);

		// thay doi gia tri cua 1 p.tu
		obj.modifyElement(arr, 9, 2);
		
		// sap xep p.tu tang dan
		obj.sort(arr);

		// in mang
		obj.printElement(arr);
	}
}
