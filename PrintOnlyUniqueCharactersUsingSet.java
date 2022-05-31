package week3.day2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharactersUsingSet {

	public static void main(String[] args) {
		/*
		 * 
		 * Psuedocode
		 * 
		 * 1) Convert String to Character array 
		 * 2) Create a new Set -> HashSet 
		 * 3) Add
		 * each character to the Set and if it is already there, remove it 
		 * 4) Finally,
		 * print the set
		 * 
		 */

		String input = "babu";
		boolean result = false;

		char[] charArray = input.toCharArray();
		Set<Character> output = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			result = output.add(charArray[i]);
			if (result == false)
				output.remove(charArray[i]);
		}
		System.out.println(output);

	}

}
