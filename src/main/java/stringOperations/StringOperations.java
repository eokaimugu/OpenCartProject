package stringOperations;

public class StringOperations {

	public static void main(String[] args) {

		// split()---Used to divide a String into multiple parts using a delimiter
		// Returns an array of characters

		String s = "okaius@comcast.net";
		String a[] = s.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);

		String w = "welcome";
		System.out.println(w.substring(2, 5));// String begins at the beginning index to the end index -i
												// then length of the String is (endIndex-beginningIndex)

		String p = "Java,Selenium,TestNg,Maven";

		String[] c = p.split(",");

		/*
		 * for(int i=0; i<c.length; i++) { System.out.println(c[i]); }
		 */

		for (String course : c) {
			System.out.println(course);
		}

		/*
		 * //String comparisons
		 * 
		 * String s1 = "welcome"; String s2 = "welcome";
		 * 
		 * System.out.println(s1==s2);//true == is normally used to compare primitive
		 * data types
		 * 
		 * System.out.println(s1.equals(s2));//true .equals() is normally for non
		 * primitive types
		 */

		/*
		 * String s1 = new String("welcome"); String s2 = new String("welcome");
		 * System.out.println(s1); System.out.println(s2);
		 * 
		 * 
		 * System.out.println(s1==s2); //false compares objects
		 * System.out.println(s1.equals(s2)); //true compares value of objects
		 */

		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = s2;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true

		System.out.println(s2 == s3);// true
		System.out.println(s2.equals(s3));// true

		String str1 = "abc";
		String str2 = "xyz";
		String str3 = "pqr";
		String all = str1.concat(str2).concat(str3);
		System.out.println(all);

	}

}
