package com.bridgelabz.day8;

public class InsertionSort {

	public static void main(String[] args) {
		String[] arr = { "India", "New York", "London", "Tokyo", "Pakistan" };

		String sortedArray[] = sort_sub(arr, arr.length);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}

	public static String[] sort_sub(String array[], int n) {
		String temp = "";
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}