package com.bridgelabz.day10;

import java.util.ArrayList;
import java.util.List;

public class PalindromeArr extends PrimeArr {
	private static List<List<Integer>> palindromeNumbers = new ArrayList<>();

	public void storePalindrome() {
		for (List<Integer> temp : primeNumbers) {
			List<Integer> palindromeList = new ArrayList<>();
			for (int j = 0; j < temp.size(); j++) {
				int num = temp.get(j);

				if (isPalindrome(num)) {
					if (!palindromeList.contains(num))
						palindromeList.add(num);
				}
			}
			if (palindromeList.size() != 0)
				palindromeNumbers.add(palindromeList);
		}
	}

	private boolean isPalindrome(int n) {
		int r, sum = 0, temp;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			return true;
		return false;
	}

	public void displayPalindrome() {
		System.out.println("-----------------Palindrome numbers--------------");
		for (List<Integer> palindromeNumber : palindromeNumbers) {
			for (Integer elements : palindromeNumber) {
				System.out.print(elements + "  ");
			}
			System.out.println();
		}
	}
}
