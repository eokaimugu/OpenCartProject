package practice;

public class SumOfPairs {

	public static void main(String[] args) {

		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++)

			{

				if (numbers[i] == 9 || numbers[i] + numbers[j] == 9) {

					System.out.println("The numbers that sum up to 9 are: " + numbers[i] + " " + numbers[j]);
				}
			}
		}

		int arr[] = { 1, 5, 9, 1, 4, 9, 6, 5, 9, 7 };
		// int n = arr.length;
		int i, j;
		System.out.print("The array is: ");
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.print("\nThe distinct elements of above array are: ");
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < i; j++)
				if (arr[i] == arr[j])
					break;
			if (i == j)
				System.out.print(arr[i] + ", ");

		}

	}

}