package practice;

public class TwoNumbersDemo {

	public static void main(String[] args) {

		// two numbers in an array whose sum is 10

		int[] arr = { 5, 7, 1, 2, 9, 6, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == 10) {
					System.out.println("the two numbers are:" + " " + arr[i] + " and " + arr[j]);
				}
			}
		}

	}

}
