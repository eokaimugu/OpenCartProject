package stringOperations;

public class ReverseString {

	public static void main(String[] args) {

		// Approah 1 by using String concatenation operator

		String str = "Eric";
		String str1 = "Shekainah";
		String reverse = "";

		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("The reverse string is " + reverse);

		// Approach 2 Using character Array
		char a[] = str1.toCharArray();
		int length = a.length;
		for (int r = length - 1; r >= 0; r--) {
			rev = rev + a[r];
		}

		System.out.println("The reverse string is " + rev);

		// Approach 3 Using StringBuffer
		StringBuffer sb = new StringBuffer(str1);
		System.out.println(sb.reverse());

	}

}
