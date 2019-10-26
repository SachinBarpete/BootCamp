package com.bridgelabz.day8;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class FrequencyCount {
	public static void countFrequencies(ArrayList<String> list) {
		Map<String, Integer> hm = new HashMap<String, Integer>();

		for (String i : list) {
			Integer j = hm.get(i);
			hm.put(i, (j == null) ? 1 : j + 1);
		}

		for (Map.Entry<String, Integer> val : hm.entrySet()) {
			System.out.println("Element " + val.getKey() + " " + "occurs" + " : " + val.getValue() + " times");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter words for frequency count : ");
		String s = scan.nextLine();
		String[] words = s.split("\\s+");

		ArrayList<String> list = new ArrayList<String>();
		for (String str : words)
			list.add(str);
		countFrequencies(list);
		scan.close();
	}
}
