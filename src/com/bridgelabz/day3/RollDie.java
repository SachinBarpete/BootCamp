package com.bridgelabz.day3;

import java.util.*;

public class RollDie {

	public static void main(String[] args) {
		System.out.println(rollDie());

	}
	
	public static int rollDie() {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter trail numbers : ");
		int n = scan.nextInt();
		int sides = 6;
		int [] arr = new int[n];
		System.out.print("Outcomes : ");
		for(int i=0;i<n;i++) {
			arr[i] = (int)(Math.random()*sides) +1;
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		Arrays.sort(arr);
		
		int max_count = 0;
		int res =arr[0];
		for(int i=0;i<n;i++) {
			int count =1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(max_count < count) {
				max_count = count;
				res = arr[i];
			}
		}
		
		
		System.out.print("Most frequent number : ");
		return res;
		
	}

}
