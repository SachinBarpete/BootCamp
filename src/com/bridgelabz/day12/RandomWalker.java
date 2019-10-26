package com.bridgelabz.day12;

import java.util.Scanner;

public class RandomWalker {
	static Scanner scan = new Scanner(System.in);

	public static int randomWalker(int n) {

		int[] x = new int[n]; // x positions
		int[] y = new int[n]; // y positions
		int cellsToVisit = n * n; // cells left to visit
		int steps = 0; // number of steps taken
		double r;
		boolean[][] visited = new boolean[n][n]; // has the i-j been visited?

		// start at center
		for (int i = 0; i < n; i++) {
			x[i] = n / 2;
			y[i] = n / 2;
		}
		visited[n / 2][n / 2] = true;
		cellsToVisit--;

		// repeat until all cells have been visited
		while (cellsToVisit > 0) {
			steps++;

			// move random walker i
			for (int i = 0; i < n; i++) {
				r = Math.random();
				if (r <= 0.25)
					x[i]++;
				else if (r <= 0.50)
					x[i]--;
				else if (r <= 0.75)
					y[i]++;
				else if (r <= 1.00)
					y[i]--;

				// check if (x[i], y[i]) is inside N-by-N boundary and has been visited
				if (x[i] < n && y[i] < n && x[i] >= 0 && y[i] >= 0 && !visited[x[i]][y[i]]) {
					cellsToVisit--;
					visited[x[i]][y[i]] = true;
				}
			}
		}
		return steps;

	}

	public static void main(String[] args) {
		System.out.println("Enter the order of grid");
		int n = scan.nextInt();
		System.out.println("total steps : " + randomWalker(n));

	}

}
