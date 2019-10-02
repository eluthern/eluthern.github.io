package erinluthern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {

		String wordToCheck = "";
		int wordLength = 0;
		int sameCount = 0;

		System.out.println("Palindrome Checker");
		Scanner in = new Scanner(System.in);
		System.out.println("Give me a word to check: >>>");
		wordToCheck = in.nextLine();
		wordToCheck = wordToCheck.replaceAll("\\s+", "");

		List<String> phraseChars = new ArrayList<String>();
		wordLength = wordToCheck.length();

		for (int i = 0; i < wordLength; i++) {
			phraseChars.add(wordToCheck.substring(i, i + 1));
		}

		for (int j = 0; j < (wordLength / 2); j++) {
			sameCount = 0;
			if (phraseChars.get(j).equalsIgnoreCase(phraseChars.get(wordLength - (j + 1)))) {
				sameCount++;
			} else {
				sameCount = 0;
			}
		}
		
		if (sameCount > 0) {
			System.out.println(wordToCheck + " is a palindrome!"); 
		}
		else {
			System.out.println(wordToCheck + " is not a palindrome.");
		}
	}
}
