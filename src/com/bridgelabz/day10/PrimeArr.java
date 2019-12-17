package com.bridgelabz.day10;

import java.util.ArrayList;
import java.util.List;

public class PrimeArr {
	static List<List<Integer>> primeNumbers = new ArrayList<>();

	private static int[][] numbers = new int[10][100];

	public void storeNums() {
		int counter = 0;
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 100; j++)
				numbers[i][j] = counter++;
	}

	public void storePrimes() {
		for (int i = 0; i < 10; i++) {
			List<Integer> primeList = new ArrayList<>();
			for (int j = 0; j < 100; j++) {
				if (isPrime(numbers[i][j]))
					primeList.add(numbers[i][j]);
			}

			primeNumbers.add(primeList);
		}
	}

	private boolean isPrime(int num) {
		if (num == 0 || num == 1)
			return false;
		if (num == 2)
			return true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}

	public void displayNumbers() {
		System.out.println("-----------------numbers--------------");
		for (int[] number : numbers) {
			for (Integer elements : number) {
				System.out.print(elements + "  ");
			}
			System.out.println();
		}
	}

	public void displayPrimes() {
		System.out.println("-----------------Prime numbers--------------");
		for (List<Integer> primeNumber : primeNumbers) {
			for (Integer elements : primeNumber) {
				System.out.print(elements + "  ");
			}
			System.out.println();
		}
	}

}