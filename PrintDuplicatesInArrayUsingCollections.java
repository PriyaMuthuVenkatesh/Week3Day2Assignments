package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArrayUsingCollections {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Set<Integer> set= new HashSet<Integer>();
		for(int i:arr)
		{
			if(!set.add(i))
			{
				System.out.println(i);
			}
		}
		
	}

}
