package com.bridgelabz.day3;

public class Binary {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		binary(num);
	}
	public static void binary(int num) {
		String s = "";
		int mod ;
		int temp = num;
		while (temp>0) {
			mod =temp%2;
			temp = temp/2;
			s = mod +s;
		}
		
		if(num <=3) {
			String add = "00"+s;
			System.out.println("Binary for " +num+  " : "+add);
		}
		else if(num<=7) {
			String add = "0"+s;
			System.out.println("Binary for " +num+  " : "+add);
		}
		else
			System.out.println("Binary for " +num+  " : "+s);
		
	}
}
