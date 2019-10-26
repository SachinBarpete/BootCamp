package com.bridgelabz.day4;

import java.util.*;
import java.util.Arrays;

public class StringFunctions {
	public static void main(String[] args) {

		System.out.println("Given string is anagram : " + anagramString());
		System.out.println("Given string is palindrome : " + palindromeString());
		System.out.print("Permutation of String using Iteration : ");
		permutationOfStringUsingIteration();
		
		System.out.print("Permutation of String using Recursion : [ ");
		permutationOfStringUsingRecursion();
		System.out.println("]");
		
		returnString();

	}

	public static boolean anagramString() {

		String string1 = "heart";
		String string2 = "earth";
		char[] str1 = string1.toCharArray();
		char[] str2 = string2.toCharArray();

		if (str1.length != str2.length) {
			return false;
		}
		int n = str1.length;
		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < n; i++) {
			if (str1[i] != str2[i])
				return false;
		}
		return true;
	}

	public static boolean palindromeString() {
		String str = "aasaa";
		String rev = "";
		int n = str.length();
		for (int i = n - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}

		for (int i = 0; i < n - 1; i++) {
			if (str.charAt(i) == rev.charAt(i))
				return true;
		}
		return false;
	}

	public static void permutationOfStringUsingIteration() {
		String str = "ABC";
		List<String> partial = new ArrayList<>();
		partial.add(String.valueOf(str.charAt(0)));
		int n = str.length();
		for (int i = 1; i < n; i++) {
			for (int j = partial.size() - 1; j >= 0; j--) {
				String s = partial.remove(j);
				for (int k = 0; k <= s.length(); k++) {
					partial.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
				}
			}
		}
		System.out.println(partial);
	}

	public static void permutationOfStringUsingRecursion() {
		String str = "ABC";
		char[] ch = str.toCharArray();

		permutations(ch, 0);

	}

	private static void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;

	}

	private static void permutations(char[] ch, int currentIndex) {

		if (currentIndex == ch.length - 1) {
			System.out.print(String.valueOf(ch)+" ");
		}
		for (int i = currentIndex; i < ch.length; i++) {
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}

	public static void returnString() {
		String str[] = new String[2];
		str[0] = "Hello";
		str[1] = "Hello";
		String str1 = str[0];
		String str2 = str[1];

		if (str1.equals(str2)) {
			System.out.println("Both strings are equal");
		} else
			System.out.println("Strings are not equal");
	}

}
