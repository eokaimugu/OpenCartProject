package collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		// HashMap hm = new HashMap();
		// Map map = new HashMap();

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// adding data pairs to the HashMap

		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(107, "Jones");
		hm.put(105, "Sasta");
		hm.put(109, "Sam");

		System.out.println(hm);

		System.out.println(hm.size());

		// to remove a pair you remove the key
		System.out.println(hm.remove(109));
		System.out.println("After removing" + " " + hm);

		// to get a value get the key of that value
		hm.get(102);

		// To print only keys from hash map

		System.out.println(hm.keySet());

		// How to print all the values from hash map

		for (Object k : hm.keySet()) {
			// System.out.println(hm.get(k));
			System.out.println(k + "  " + hm.get(k));

		}

		hm.clear();

	}

}
