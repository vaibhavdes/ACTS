package com.app;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Number of Rows
		int rows = 5;
		// Number of Cols
		int cols = 9;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// Printing the Pattern
				if (i == 0 || i == (rows - 1))
					System.out.print("*");
				else if (j == 0 || j == (cols - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
