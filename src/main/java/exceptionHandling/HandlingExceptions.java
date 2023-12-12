package exceptionHandling;

import java.util.Scanner;

public class HandlingExceptions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		try {
			System.out.println(100 / num);// Arithmetic exception
		} catch (Exception e) {
			// e.printStackTrace();
			e.getMessage();
			System.out.println("You have entered an invalid number.");
		}

		System.out.println("Program is completed...");
		System.out.println("Program has exited...");

	}

}
