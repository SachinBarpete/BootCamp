package com.bridgelabz.day8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program1 {

	public static String[] readFile() {

		ArrayList<String> result = new ArrayList<>();

		try (Scanner s = new Scanner(new FileReader("C:\\Users\\Barpete Brother's\\Desktop\\SearchWord.txt"))) {
			while (s.hasNext()) {
				result.add(s.nextLine());
			}

		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}

		String str[] = new String[result.size()];

		for (int j = 0; j < result.size(); j++) {

			str[j] = result.get(j);
		}
		String s = "";
		for (int i = 0; i < str.length; i++) {
			s = s + str[i];
		}
		int n = s.length();
		String[] array = new String[n];
		for (int i = 0; i < n; i++) {
			array = s.split(",");
		}
		return array;
	}

	static int binarySearch(String[] arr, String x) {
		Arrays.sort(arr);
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = x.compareTo(arr[m]);

			if (res == 0)
				return m;

			if (res > 0)
				l = m + 1;
			else
				r = m - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		String word = "welcome";
		String[] arr = readFile();
		int result = binarySearch(arr, word);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}

}
