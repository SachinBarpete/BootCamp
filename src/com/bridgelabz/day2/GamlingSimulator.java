package com.bridgelabz.day2;

import java.util.HashMap;
import java.util.Scanner;

public class GamlingSimulator {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int countWin = 0;
        int totalBets = 0;
        while(N-- > 0){
            int stake = sc.nextInt();
            int goal = sc.nextInt();
            
            HashMap betResult = GamlingSimulator.findBetResult(stake, goal);
            if ((boolean)betResult.get("status"))
                countWin++;
            totalBets += (int) (betResult.get("noOfBet"));
        }

        System.out.println("Number of times won: " + countWin);
        System.out.println("Percent win: " + ((countWin * 100)/N));
        System.out.println("Average number of bets: " + (totalBets/N));
        sc.close();
    }

	private static HashMap findBetResult(int stake, int goal) {
		// TODO Auto-generated method stub
		return null;
	}
}