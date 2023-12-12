package exceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println("Program has started...");
		System.out.println("Program is in progress...");

		// Example 1
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter a number:");
		 * int num = sc.nextInt();
		 * 
		 * System.out.println(100/num);//Arithmetic exception
		 * 
		 * System.out.println("Program is completed...");
		 * System.out.println("Program has exited...");
		 */

		int[] a = { 12, 25, 5, 10, 50 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println("Enter position (0-4):");
		int pos = sc.nextInt();
		a[pos] = num;
		System.out.println(a[pos]);

		System.out.println("Program is completed...");
		System.out.println("Program has exited...");

		String s = "1234";
		int number = Integer.parseInt(s);
		System.out.println(number);

	}

}
