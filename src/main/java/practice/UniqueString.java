package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class UniqueString {

	public static void main(String[] args) {

		String[] countries = { "Ghana", "Guinea", "Mali", "Ghana", "Togo", "Nigeria", "Mali", "Tanzania" };

		// ArrayList<String> countryList =new ArrayList<String>(countries);
		// Converting the array to array list
		List<String> countrylist = Arrays.asList(countries);

		// Create Hashset and parse Hashset constructor
		HashSet<String> hs = new HashSet<String>(countrylist);

		System.out.println("The unique values are " + hs);

		System.out.println(
				"----------------------------------------------------------------------------------------------");
		// Start with an ordinary array
		String[] names = { "Rahul", "Utkarsh", "Rahul", "Shubham", "Neelam", "Shubham" };
//Create an array list or list
		List<String> al = new ArrayList<String>();

// adding elements of array to arrayList.
		Collections.addAll(al, names);
		// Create a Hashset and parse a hashset constructor
		HashSet<String> set = new HashSet<String>(al);

		System.out.println(set);

	}

}
