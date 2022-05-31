package week3.day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FindIntersectionUsingCollections {

	public static void main(String[] args) {
		int arr1[] = { 3, 2, 11, 4, 6, 7 };
		int arr2[] = { 1, 2, 8, 4, 9, 7 };
		ArrayList<Integer> first = new ArrayList<Integer>();
		ArrayList<Integer> second = new ArrayList<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			first.add(arr1[i]);
		}
		System.out.println(first);
		for (int i = 0; i < arr2.length; i++) {
			second.add(arr2[i]);
		}
		System.out.println(second);
		for (int i = 0; i < first.size(); i++) {
			for (int j = 0; j < second.size(); j++) {
				Integer f = first.get(i);
				Integer s = second.get(j);
				if (f == s) {
					System.out.println(f);
				}
			}

		}
	}

}
