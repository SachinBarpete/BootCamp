package com.bridgelabz.day2;

import java.util.Scanner;
public class FlipCoin {
	
	public static void flipCoin() {
		int toss;
		int counter=0;
		int heads=0,tails=0;
		double random;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount of time to toss the coin ");
		toss = scan.nextInt();
		random = Math.random();
		while (counter<toss) {
			if(random>0.5) {
				heads++;
				System.out.println("Head");
			}
			else {
				tails++;
				System.out.println("Tail");
			}
			counter++;
			random = Math.random();
		}
		System.out.println("");
		System.out.println("for your tosses you got \n"+"------------------\n"+"Heads : "+heads+"\nTails : "+tails);
		scan.close();
	}
	
	public static void main(String[] args) {
		
		flipCoin();
	}

}
