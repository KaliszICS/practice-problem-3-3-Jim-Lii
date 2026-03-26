/*
File Name: Else if
Author: Jim Li
Date Created: Mar. 25, 2026
Date Last Modified: Mar. 25, 2026
*/
public class PracticeProblem
{
	public static void main(String[] args) {

	}

	public static String evenOrOdd(int num) {
		if (num == 0) {
			return "Zero";
		}
		else if (num % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}
	}

	public static String positiveOrNegative(int num) {
		if (num > 0) {
			return "Positive";
		}
		else if (num < 0) {
			return "Negative";
		}
		else {
			return "Zero";
		}
	}

	public static String pluralize(String word) {
		word = word.toLowerCase();
		if (word.substring(word.length() - 2).equals("ey")) {
			return "eys";
		}
		else if (word.substring(word.length() - 1).equals("y")) {
			return "ies";
		}
		else if (word.substring(word.length() - 3).equals("ife")) {
			return "ives";
		}
		else {
			return "s";
		}
	}
}
