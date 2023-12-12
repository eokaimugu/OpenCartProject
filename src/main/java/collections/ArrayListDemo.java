package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	/*
	 * 1) Heterogeneous data allowed 2) Insertion order preserved (Index concept) 3)
	 * Duplicate elements allowed 4) Multiple nulls allowed
	 */

	public static void main(String[] args) {

		// declaration
		ArrayList al = new ArrayList();
		// ArrayList <String> as = new ArrayList<String>();
		// List myList = new ArrayList();

		// adding data into ArrayList
		al.add(100);
		al.add(10.5);
		al.add("welcome");
		al.add(true);
		al.add(100);
		al.add(null);
		al.add(null);

		// size of array list
		System.out.println(al.size());
		System.out.println(al);

		// to remove data from array list

		al.remove(2);

		// inserting new data into array list

		al.add(2, "java");

		// after insertion
		System.out.println(al);

		// get a specific data from array list

		System.out.println(al.get(3));

		for (Object x : al) {
			System.out.println(x);

		}

		al.clear();
		// after clearing the array list
		System.out.println("after clearing the array list" + " " + al);

	}

}
