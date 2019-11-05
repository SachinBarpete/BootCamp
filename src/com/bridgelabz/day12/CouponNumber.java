package com.bridgelabz.day12;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumber {

	public static void couponNumber() {

		System.out.println("Enter the number for genrate coupon number less than 1000");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Random random = new Random();
		int count = 0;
		HashSet<Integer> couponNo = new HashSet<>();
		for (int i = 0; i < n; i++) {
			int temp = random.nextInt(1000);
			count++;
			if (couponNo.contains(temp))
				n++;
			else
				couponNo.add(temp);
		}

		
		System.out.println("Total random no genrated " + count);
		for (int elements : couponNo)
			System.out.print(elements + " ");
		scan.close();
	}

	public static void main(String[] args) {

		couponNumber();
	}
}
