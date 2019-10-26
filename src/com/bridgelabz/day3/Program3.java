package com.bridgelabz.day3;

public class Program3 extends Binary{

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
		Program3 obj = new Program3();
		obj.binary(num);
		swapNibbles(num);
		
	}
	static void swapNibbles(int num) 
	{ 
	    int num1 = ((num & 0x0F) << 4 | (num & 0xF0) >> 4); 
	    System.out.println("number after swap nibbles : "+num1);
	    
	    if(isPower(num1)) {
			System.out.println("resultant number "+num1+" is a power of 2");
		}
	    else
	    	System.out.println("resultant number "+num1+" is not a power of 2");
	} 
	static boolean isPower(int num1) {
		
		for (int i = 2; i <= (int)Math.sqrt(num1); i++) 
		{ 
			float f = (float)Math.log(num1) / (float) Math.log(i); 
						
			if ((f - (int)f) == 0.0) 
				return true;	 
		} 
		return false;
	}

}
