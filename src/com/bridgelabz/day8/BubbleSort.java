package com.bridgelabz.day8;

public class BubbleSort {
	static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;

	}

	public static void main(String[] args) {

		int[] arr = { 13, 34, 21, 98, 2, 36, 56, 75, 65 };
		System.out.print("elements before sorting : ");
		for (int a1 : arr)
			System.out.print(a1 + " ");
		int[] a2 = bubbleSort(arr);
		System.out.print("\nelements after sorting : ");
		for (int res : a2)
			System.out.print(res + " ");
	}

}
