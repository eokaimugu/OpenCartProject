package arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {

		// how to extract all the values from an array

		int[] a = { 100, 200, 600, 700, 900 };
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}

		for (int x : a) {
			System.out.println(x);
		}

		// Two Dimensional arrays
		int t[][] = { { 300, 500, 100 }, { 800, 400, 200 }, { 500, 900, 400 } };
		// To get the length of a two array

		int rowlength = t.length;// This gives the values in the rows
		int columnlength = t[0].length;// This gives the values in the columns
		System.out.println(rowlength);
		System.out.println(columnlength);

		// Reading data from two dimensional array using classic for loop

		for (int r = 0; r < t.length; r++) {

			for (int c = 0; c < t[r].length; c++) {
				System.out.print(t[r][c] + "\t");
			}

		}

		// Using enhanced for loop

		for (int x[] : t) {
			for (int v : x) {
				System.out.print(v + " ");
			}
			System.out.println();
		}

	}

}
