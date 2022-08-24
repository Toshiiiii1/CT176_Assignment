package buoi1;

import java.util.Scanner;

public class Bai3 {
	
	// tim max
	public double findMax(double[] newArr) {
		double max = Double.MIN_VALUE;
		for (double e : newArr) {
			if (e > max)
				max = e;
		}

		return max;
	}

	// tinh tong
	public double sum(double[] newArr) {
		double sum = 0;
		for (double e : newArr) {
			sum += e;
		}

		return sum;
	}

	// chuyen doi mang kieu chuoi -> mang kieu so thuc
	public double[] convertStringToDouble(String[] Arr) {
		int i;
		double temp;
		double[] newArr = new double[Arr.length];
		for (i=0; i < Arr.length; i++) {
			try {
				temp = Double.parseDouble(Arr[i]);
			} catch (Exception e) {
				temp = 0;
			}
			newArr[i] = temp;
		}
		
		return newArr;
	}
	public static void main(String[] args) {
		Bai3 mainObj = new Bai3();
		double[] doubleArr = mainObj.convertStringToDouble(args);
		System.out.println(mainObj.findMax(doubleArr));
		System.out.println(mainObj.sum(doubleArr));
	}
}