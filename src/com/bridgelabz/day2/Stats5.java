package com.bridgelabz.day2;

public class Stats5 {
	
	public static void main(String[] args) {
		double [] arr = new double[5];
		int n = arr.length;
		for(int i=0;i<n;i++) {
			arr [i] =  Math.random()*1.0;
		}
		System.out.println("elements are ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		double average = (arr[0]+arr[1]+arr[2]+arr[3]+arr[4])/n;
		double min = Math.min(arr[0], Math.min(arr[1],Math.min(arr[2], Math.min(arr[3], arr[4]))));
		double max = Math.max(arr[0], Math.max(arr[1],Math.max(arr[2], Math.max(arr[3], arr[4]))));
		System.out.println("Average  = "+average);
		System.out.println("minimum  = "+min);
		System.out.println("maximun  = "+max);
	}

}
