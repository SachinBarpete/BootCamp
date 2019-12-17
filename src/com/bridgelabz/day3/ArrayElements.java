package com.bridgelabz.day3;

public class ArrayElements {

	public static void main(String[] args) {

		int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85, 10, 20 };
		int n = arr.length;
		System.out.print("given array is : ");
		for (int ar : arr) {
			System.out.print(ar + " ");
		}
		System.out.println();
		secondLargestElement(arr, n);
		secondSmallestElement(arr, n);
	}

	public static void secondLargestElement(int arr[], int n) {
		int largest = arr[0];
		int secondLargest = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Second largest element : " + secondLargest);
	}

	public static void secondSmallestElement(int arr[], int n) {
		int smaller = arr[0];
		int secondSmaller = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] < smaller) {
				secondSmaller = smaller;
				smaller = arr[i];
			} else if (arr[i] < secondSmaller) {
				secondSmaller = arr[i];
			}
		}
		System.out.println("Second smallest element : " + secondSmaller);
	}

}
