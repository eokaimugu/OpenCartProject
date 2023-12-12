package collections;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		// Set s = new HashSet();
		// HashSet<Integer> sh = new HashSet<Integer>();

		hs.add(100);
		hs.add("welcome");

		hs.add(10.5);

		hs.add(null);

		hs.add('a');
		System.out.println(hs);

		System.out.println(hs.size());

		// removing values from HashSet

		System.out.println(hs.remove('a')); // you have to directly pass the value

		// insertion is not possible in hash set
		// getting specific value from hash set is not possible

		for (Object x : hs) {
			System.out.println(x);
		}

	}

}
