package practice;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		/*
		 * Compare the first two elements of the array if the first element is greater
		 * than the second swap them. Then, compare 2nd and 3rd elements if the second
		 * element is greater than the 3rd swap them. Repeat this till the end of the
		 * array.
		 */

		int temp;
		int arr[] = { 17, 10, 5, 9, 15, 23 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The second largest number is: " + arr[arr.length - 2]);

		// Another solution
		int numbers[] = { 10, 20, 25, 63, 96, 57 };
		Arrays.sort(numbers);
		int secLarge = numbers[numbers.length - 2];

		System.out.println(secLarge);
	}

}
