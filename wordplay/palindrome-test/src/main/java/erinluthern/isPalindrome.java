package erinluthern;

import java.util.ArrayList;
import java.util.List;

public class isPalindrome {

	public String palindromeCheck(String wordToCheck) {

		wordToCheck = "";
		int wordLength = 0;
		int sameCount = 0;

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
			return (wordToCheck + " is a palindrome!");
		} else {
			return (wordToCheck + " is not a palindrome.");
		}
	}
}
