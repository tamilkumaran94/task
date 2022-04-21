package org.dropdown.pre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DropDownPre {

	public static void main(String[] args) {

		// 1. How to copy value from List to Set

		List<Integer> l1 = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20);
		Set<Integer> lHashSet = new LinkedHashSet<Integer>(l1);
		lHashSet.addAll(l1);
		System.out.println("Created LinkedHashSet is");
		for (Integer x : lHashSet) {
			System.out.println(x);
		}


		// 2. Find the List Length

		List<Integer> l2 = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20);
		int size = l2.size();
		System.out.println("The list length is : " + size);


		// 3. How to get the last index value in List (without hardcore index)

		List<Integer> l3 = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20);
		int lastIndex = l3.size();
		System.out.println("The last index value in List is : " + l3.get(lastIndex - 1));


		// 4. How to get the 1st 5 values in List

		List<Integer> l4 = new ArrayList<Integer>(Arrays.asList(105, 205, 305, 405, 505, 605, 705, 805));

		System.out.println("The 1st 5 values in the List are :");

		for (int i = 0; i < 5; i++) {
			Integer integer = l4.get(i);
			System.out.println(integer);
		}


		// 5. How to get the middle index value in List

		List<Integer> l5 = new ArrayList<Integer>(Arrays.asList(105, 205, 305, 405, 505, 605, 705, 805));
		int middle = (l5.size()) / 2;
		Integer integer = l5.get(middle);
		System.out.println("Value of middle index is : " + integer);


		// 1. How to get the last 5 index value in List

		List<Integer> l6 = new ArrayList<Integer>(Arrays.asList(105, 205, 305, 405, 505, 605, 705, 805, 905));

		System.out.println("The last 5 index values in the List are :");

		for (int i = 5; i > 0; i--) {
			System.out.println(l6.get(l6.size() - i));
		}


		// 12. Print the alternate number in List

		List<Integer> l7 = new ArrayList<Integer>(Arrays.asList(105, 205, 305, 405, 505, 605, 705, 805, 905));

		System.out.println("The alternate (even) index number values are : ");

		for (int j = 0; j < l7.size(); j++) {
			if (j % 2 == 0) {
				Integer integer2 = l7.get(j);
				System.out.println(integer2);
			}
		}

		System.out.println("The alternate (odd) index number values are : ");

		for (int j = 0; j < l7.size(); j++) {
			if (j % 2 != 0) {
				Integer integer2 = l7.get(j);
				System.out.println(integer2);
			}
		}


		// 13. Iterate the List using for loop

		List<Integer> l8 = new ArrayList<Integer>(Arrays.asList(105, 205, 305, 405, 505, 605, 705, 805));

		System.out.println("List values using for loop are :");

		for (int i = 0; i < l8.size(); i++) {
			Integer integer3 = l8.get(i);
			System.out.println(integer3);
		}


		// 14. Iterate the list using Enhanced for loop

		List<Integer> l9 = new ArrayList<Integer>(Arrays.asList(105, 205, 305, 405, 505, 605, 705, 805));

		System.out.println("List values using enhanced for loop are :");

		for (Integer integer4 : l9) {
			System.out.println(integer4);
		}

		
	}
}



