package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Number of Test Cases
		int queries;
		// Size of Array
		int size;
		// Temp Value to Insert into Array
		int temp;

		System.out.println("Enter Number of Arrays");
		queries = sc.nextInt();

		// Creating Arrays
		for (int i = 0; i < queries; i++) {
			// for each query
			System.out.println("Enter Size of Array No " + (i + 1));
			size = sc.nextInt();
			int a[] = new int[size];

			System.out.println("Enter Element for Arary");
			for (int j = 0; j < size; j++) {
				// System.out.println("Enter Element No: " + (j + 1) + " for Array No: " + (i +
				// 1));
				temp = sc.nextInt();
				a[j] = temp;
			}

			// Print the Array in ZIG ZAG
			// a < b > c < d > e < f
			for (int k = 0; k < size; k++) {
				if (k < size) {
					if (k == (size - 1) || ((k + 1) % 2 != 0) && a[k] < a[k + 1]) {

					} else if (k == (size - 1) || ((k + 1) % 2 == 0) && a[k] > a[k + 1]) {

					} else {
						temp = a[k + 1];
						a[k + 1] = a[k];
						a[k] = temp;
					}
				}
			}

			System.out.println("Elements of Array No in ZIG-ZAG: " + (i + 1));
			for (int k = 0; k < size; k++) {
				System.out.print(a[k] + " ");
			}
			System.out.println(" ");
		}

	}

}
