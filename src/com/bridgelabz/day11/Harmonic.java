package com.bridgelabz.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Harmonic {
	static List<List<Double>> harmonicSeries = new ArrayList<>();

	public static void main(String... a) {
		System.out.print("Enter any number : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		double result = 0.0;
		for (int i = 1; i <= num; i++) {
			result = result + (double) 1 / i;

			List<Double> series = new ArrayList<>();

			for (double j = 1; j <= i + 1; j++) {
				if (!series.contains(result))
					series.add(result);
			}

			harmonicSeries.add(series);
		}

		for (List<Double> seriesList : harmonicSeries) {
			for (Double elements : seriesList) {
				System.out.print(elements + " ");
			}
			System.out.println();
		}
		s.close();
	}
}
