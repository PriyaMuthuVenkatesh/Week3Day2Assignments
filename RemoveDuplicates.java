package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	static String output = "";

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		 // storing array as collections to remove duplicates
		LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(split));
		System.out.println(set); // print collections without duplicates
		// convert collections to string and print
		for (String word : set) {
			output = output + word + " ";
		}
		System.out.println(output);

	}

}
