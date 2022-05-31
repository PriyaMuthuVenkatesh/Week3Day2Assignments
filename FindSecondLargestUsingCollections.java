package week3.day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class FindSecondLargestUsingCollections {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i=0;i<data.length;i++)
		{
			list.add(data[i]);
		}
		System.out.println(list);
	    Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(list.size()-2)); //print 2nd largest number in list

	}

}
