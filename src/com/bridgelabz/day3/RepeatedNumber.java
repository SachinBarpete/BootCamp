package com.bridgelabz.day3;

import java.util.HashSet;
import java.util.Random;

public class RepeatedNumber {

	public static void main(String[] args) {
		int arr [] = new int[100];
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			arr[i] = i+1;
		}
		Random random = new Random();
		arr[99] = random.nextInt(100);
		System.out.println("Repeated number : "+repeatNumber(arr, n));
	}
	public static int repeatNumber(int arr[],int n) {
		
		HashSet <Integer> s = new HashSet<>();
		for(int i=0;i<n;i++) {
			if(s.contains(arr[i]))
				return arr[i];
			s.add(arr[i]);
		}
		return 0;
	}

}
