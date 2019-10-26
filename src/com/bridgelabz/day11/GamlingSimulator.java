package com.bridgelabz.day11;

import java.util.Scanner;

public class GamlingSimulator {

	private void gamlingSimulator(int stake, int goal, int trails ) {
		int [][]arr = new int[3][2];
		
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter stake goal and number of trails");
		int stake = scan.nextInt();
		int goal  = scan.nextInt();
		int trails  = scan.nextInt();
		GamlingSimulator gs  = new GamlingSimulator();
		gs.gamlingSimulator(stake, goal, trails);
		
		scan.close();
	}
}
