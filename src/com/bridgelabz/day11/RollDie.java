package com.bridgelabz.day11;

import java.util.Scanner;

public class RollDie 
{
	private void rollDie(int n) {
		int sides=6;
		int [][] arr = new int [6][2];
		for(int i=0;i<6;i++) {
			arr[i][0]=(i+1);
		}
		while(n>0) {
			int random = (int)(Math.random()*sides) +1;
			arr[random-1][1]++;
			n--;
		}
		for(int []temp : arr) {
			for(Integer elements : temp)
				System.out.print(elements+ "   ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter trail numbers : ");
		int n = scan.nextInt();
		RollDie rd = new RollDie();
		rd.rollDie(n);
		scan.close();
	}
	
} 
