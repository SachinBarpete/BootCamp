package com.bridgelabz.day10;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNum2DArray {
	static ArrayList<ArrayList<Integer>> primeList = new ArrayList<ArrayList<Integer>>();
	public static void arrayStore() {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[10][100];
		int counter = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				arr[i][j] = counter++;
			}

		}

		for (int array[] : arr) {
			for (int elements : array) {
				System.out.print(elements + "  ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		PrimeNum2DArray.arrayPrime2D(arr);
		scan.close();
	}

	public static void arrayPrime2D(int[][] arr) {
		
		 for (int i = 0; i < 10; i++) {
	            ArrayList <Integer>primeNums = new ArrayList<>();
	            for (int j = 0; j < 100; j++) {
	                if (isPrime(arr[i][j]))
	                    primeNums.add(arr[i][j]);
	            }
	            primeList.add(primeNums);
	        }
		  for (int i = 0; i < 10; i++) { 
			  
			  for(int j=0;j<primeList.get(i).size();j++) {
				  System.out.print(primeList.get(i).get(j)+"  ");
			  }
			  System.out.println();
		  }
	}          

	public static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		} 
		else {
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					return false;
				} 
			}
		}
		return true;
	}

	public static void main(String[] args) {

		arrayStore();

	}

}

