package week3.day2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MissingNumberUsingCollections {

	public static void main(String[] args) {
		/*
		 * Psuedocode
		 * 
		 * 1) Remove the duplicates using Set 
		 * 2) Make sure the set is in the ascending order 
		 * 3) Iterate from the starting number and verify the next number is + 1
		 * 4) If did not match, that is the number
		 * 
		 */
		int[] numbers = { 4, 6, 7, 2, 3, 1, 9, 10, 8, 8, 6, 2 };
		boolean b = false;
		Set<Integer> set = new HashSet<Integer>();
		for (int i : numbers) {
			set.add(i);

		}
		System.out.println(set);
		for(int i=1;i<set.size();i++)
		{
			boolean b1 = set.contains(i);
			if(b1==false)
			{
				System.out.println(i);
			}
		}
				

	}

}
